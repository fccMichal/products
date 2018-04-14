package pl.michalKozakiewicz1.products.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.michalKozakiewicz1.products.model.ProductForm;


@Controller
        public class WebController {

        @GetMapping("/")
        public String showForm(ProductForm productForm) {
            return "form";
        }

        @PostMapping("/")
        public String checkProductInfo(@Valid ProductForm productForm, BindingResult bindingResult) {

            if (bindingResult.hasErrors()) {
                return "form";
            }

            return "redirect:/results";
        }
    }
