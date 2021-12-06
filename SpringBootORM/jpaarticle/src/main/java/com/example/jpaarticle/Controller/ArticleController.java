package com.example.jpaarticle.Controller;

import com.example.jpaarticle.Entity.Article;
import com.example.jpaarticle.Repository.ArticleRepository;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import net.bytebuddy.TypeCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * FileName:ArticleController
 * Author:zhujinwei
 * Date: 2021年11月24日 0024 08:46:21
 */
@Controller
@RequestMapping("article")
public class ArticleController {
    @Autowired
    ArticleRepository articleRepository;

    @RequestMapping("")
    public ModelAndView ArticleList(@RequestParam(value = "start", defaultValue = "0") Integer start,
                                    @RequestParam(value = "limit", defaultValue = "5") Integer limit) {
        start = start < 0 ? 0 : start;
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(start, limit, sort);
        Page<Article> page = articleRepository.findAll(pageable);
        ModelAndView mav = new ModelAndView("article/list");
        mav.addObject("page", page);
        return mav;
    }


    @GetMapping("/{id}")
    public ModelAndView getArticle(@PathVariable("id") Integer id) throws Exception {
        Article article = articleRepository.findById(id);
        ModelAndView mav = new ModelAndView("article/show");
        mav.addObject("article", article);
        return mav;
    }

    @GetMapping("/add")
    public String addArticle() throws Exception {
        return "article/add";
    }

    @PostMapping("")
    public String saveArticle(Article article) throws Exception {
        articleRepository.save(article);
        return "redirect:/article/";
    }

    @DeleteMapping("/{id}")
    public String deleteArticle(@PathVariable("id") long id) throws Exception {
        articleRepository.deleteById(id);
        return "redirect:";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView editArticle(@PathVariable("id") Integer id) throws Exception {
        Article article = articleRepository.findById(id);
        ModelAndView mav = new ModelAndView("article/edit");
        mav.addObject("article", article);
        return mav;
    }

    @PutMapping("/{id}")
    public String editArticleSave(Article article, long id) throws Exception {
        article.setId(id);
        articleRepository.save(article);
        return "redirect:";
    }

}
