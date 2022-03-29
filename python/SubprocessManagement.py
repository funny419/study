import subprocess

print(subprocess.call(['ls']))
print(subprocess.check_call(['ls']))
print(subprocess.check_output(['ls']))