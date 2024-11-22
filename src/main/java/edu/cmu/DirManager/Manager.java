package edu.cmu.DirManager;

public class Manager {
    private DirOps dirOps;

    /**
     * Creates a new directory at the specified path.
     *
     * @param path the path where the new directory should be created
     * @throws IllegalArgumentException if the path is invalid
     * @throws DirectoryAlreadyExistsException if the directory already exists
     * @return true if the directory creation was successful, false otherwise
     */
    public boolean newDirectory(String path) throws IllegalArgumentException, DirectoryAlreadyExistsException {
        if (dirOps.checkDirectoryExists(path)) {
            throw new DirectoryAlreadyExistsException("Directory already exists at: " + path);
        } else if (!dirOps.checkPathValid(path)) {
            throw new IllegalArgumentException("Invalid path: " + path);
        } else {
            dirOps.createDirectory(path);
            return true;
        }
    }

    // Custom exception for directory existence error
    public static class DirectoryAlreadyExistsException extends Exception {
        public DirectoryAlreadyExistsException(String message) {
            super(message);
        }
    }
}
