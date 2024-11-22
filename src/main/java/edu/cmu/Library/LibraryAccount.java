package edu.cmu.Library;

public class LibraryAccount {
    private LibraryService libraryService;
 
    /**
     * Retrieves an array of checked out books associated with the specified user ID. If the user
     * has no books checked out, the returned list will be empty. Since multiple households may
     * share a single account, the user ID is of the form "libraryID:userName".
     * e.g., "12345:John Doe"
     *
     * @param userId the user ID whose books are to be retrieved, in the form "libraryID:userName"
     * @return an array of Book objects the user has checked out
     */
    public Book[] getBooks(String userId) {
        UserId user = new UserId(userId); // Create a UserId object from the input
        return libraryService.getBooks(user.getName(), user.getId());  // Use name and id from the UserId object
    }
}