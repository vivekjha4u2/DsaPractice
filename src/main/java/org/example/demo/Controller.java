//package org.example.demo;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@RestController
//public class Controller {
//
//    @GetMapping("/getEmployees")
//    public ResponseEntity<List<Employee>> getEmployeesFromDepartment(@QueryParam String departmentId
//    @RequestHeader("authorization") String token
//    ){
//
//        ResponseEntity response = new ResponseEntity();
//        try {
//            //logging
//            Employee employee1 = new Employee("name1", "dep1", new Date("24/01/2023"));
//            Employee employee2 = new Employee("name2", "dep2", new Date("20/01/2023"));
//            Employee employee3 = new Employee("name3", "dep3", new Date("27/01/2023"));
//            List<Employee> employeeList = new ArrayList<>();
//            //employeeList = fetching from db
//            if(CollectionUtils.isEmpty(employeeList)){
//                response.setMessage("There are no emplyees in the given department")
//            }else {
//                employeeList.add(employee1);
//                employeeList.add(employee2);
//                employeeList.add(employee3);
//
//                employeeList.sort((e1, e2) -> e1.getJoiningDate().compareTo(e2.getJoiningDate()));
//                response.setResponse(employeeList);
//                response.setMessage("Success");
//            }
//        }catch(Exception e){
//            logger.error("Exception while fetching employees :: ",e.getMessage());
//            response.setMessage("Failure");
//
//        }
//        return response;
//    }
//}
