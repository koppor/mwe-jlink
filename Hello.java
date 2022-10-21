import java.lang.module.ModuleDescriptor;

class Hello {

    public void method0(ModuleDescriptor[] input) {
        input[0] = null;
        ModuleDescriptor[] local = input;
        local[1] = null;
        return;
    }

    public void method1(ModuleDescriptor[] input) {
        input[1] = null;
        return;
    }

    public void method2() {
        return;
    }

    public ModuleDescriptor[] moduleDescriptors() {
        ModuleDescriptor[] input = new ModuleDescriptor[10];
        method0(input);
        method1(input);
        method2();
        return input;
    }

    public void updateArray(Object[] test) {
        test[0] = "NEW CONTENT";

    }

    public static void main (String args[])
    {
        Hello hello = new Hello();
        ModuleDescriptor[] result = hello.moduleDescriptors();
        System.out.println(result[0]);

        Object[] test = new Object[2];
        hello.updateArray(test);
        System.out.println(test[0]);
    }
}
