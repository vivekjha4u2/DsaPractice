package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String dept;
    private Date dob;
    //empName
    //mgrId

    List<Address> addressList;
}
//R 12 21
//M 21 33
// select e1.empName, e2.empName from employee e1 inner join employee e2 on e1.id = e2.mgrId and e1.id<> e2.id;