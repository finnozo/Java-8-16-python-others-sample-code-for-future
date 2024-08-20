import os

# Specify the path to the folder containing your images
folder_path = '/Users/sushil/Downloads/koc/Aug/20/KSN'

# Iterate over all files in the folder
for filename in os.listdir(folder_path):
    if " " in filename:  # Check if the file name contains spaces
        # Create the new filename by replacing spaces with hyphens
        new_filename = filename.replace(" ", "-")
        
        # Get the full path of the old and new file names
        old_file = os.path.join(folder_path, filename)
        new_file = os.path.join(folder_path, new_filename)
        
        # Rename the file
        os.rename(old_file, new_file)

print("Filenames updated successfully!")
