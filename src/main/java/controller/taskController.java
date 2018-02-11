package controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class taskController {
	
	@Autowired
	private taskRepository tr;
	
	@GetMapping(path="/")	
	public@ResponseBody String greeting()
	{
		return "Welcome to game REST  ";
	}
	
	
	@GetMapping(path="/add/{task}/{date}/{lable}")	
	public @ResponseBody String  add(@PathVariable("task") String task,@PathVariable("dte") Date dte )
	{
		
		taskModel tm = new taskModel();
		tm.setTask(task);
				
		tr.save(tm);
		return "add";
	}
	@GetMapping(path="/all")
	@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	public @ResponseBody Iterable<taskModel> fetch()
	{
		return tr.findAll();
	}
}
