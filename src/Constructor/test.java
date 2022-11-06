package Constructor;

public class test {
    public static void main (String args[]){
        person p1 = new person("Raquib", 007);
        person p2 = new person("Hassan", 40, 005);
    }
    
}

/*Private:    The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

Default:    The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

Protected:    The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.

Public:    The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package. */