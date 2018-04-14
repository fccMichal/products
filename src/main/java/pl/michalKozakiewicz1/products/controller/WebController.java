package pl.michalKozakiewicz1.products.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.michalKozakiewicz1.products.model.ProductForm;


@Controller
        public class WebController {

        @GetMapping("/")
        public String showForm(ProductForm productForm) {
            return "form";
        }

        @PostMapping("/")
        public String checkProductInfo(@Valid ProductForm productForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

            if (bindingResult.hasErrors()) {
                return "form";
            }

            redirectAttributes.addFlashAttribute("product", productForm);
            return "redirect:/results";
        }

        @GetMapping("/results")
    public String getResults(){
            return "results";
        }
    }
