public class INCLibrary implements Library{
    @Override
    public void borrowResource(Resource resource) {
        resource.borrow();
    }
}
