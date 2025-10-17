package com.alperenavci.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alperenavci.dto.DtoEmployee;
import com.alperenavci.service.IEmployeeService;
import com.alperenavci.starter.ExceptionManagementApplication;

// classes = "starter" pektinin içindeki class 'ı belirtmelisin.
// Bunu yapmamızdaki amaç, bazen test dosyası ana projeyi başlatamayabiliyor.
@SpringBootTest(classes = {ExceptionManagementApplication.class})
class ExceptionManagementApplicationTests {
	
	// Servis katmanını autowired ile enjekte ederek bağlanıyoruz.
	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("beforeEach çalıştı");
	}
	
	
	@Test
	void contextLoads() {
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		if (employee != null) {
			System.out.println("İsim: " + employee.getName());
		}
		
		// Eğer bu değer null ise bu test 'e başarısız çıktısı verir.
		assertNotNull(employee); 
		
		// (beklenen, gelen) şeklindedir. Eğer uyuşmazlarsa test başarısız.
		assertEquals(4L, employee.getId());
	}

	@AfterEach
	public void afterEach() {
		System.out.println("afterEach çalıştı.");
	}
}
