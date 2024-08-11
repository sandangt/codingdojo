# Compilers
CXX = g++
CC = gcc

# Compiler flags
CXXFLAGS = -Wall -Wextra -Iinclude -std=c++17
CFLAGS = -Wall -Wextra -Iinclude -std=c11

# Source and object files
SRCDIR = src
BUILDDIR = build
TARGET = app

# Find all .cpp and .c files and corresponding .o files
CXX_SRCS = $(wildcard $(SRCDIR)/*.cpp)
C_SRCS = $(wildcard $(SRCDIR)/*.c)
SRCS = $(CXX_SRCS) $(C_SRCS)
OBJS = $(patsubst $(SRCDIR)/%.cpp, $(BUILDDIR)/%.o, $(CXX_SRCS)) $(patsubst $(SRCDIR)/%.c, $(BUILDDIR)/%.o, $(C_SRCS))

# Default target
all: $(TARGET)

# Build target
$(TARGET): $(OBJS)
	$(CXX) $(OBJS) -o $(TARGET)

# Build C++ objects
$(BUILDDIR)/%.o: $(SRCDIR)/%.cpp | $(BUILDDIR)
	$(CXX) $(CXXFLAGS) -c $< -o $@

# Build C objects
$(BUILDDIR)/%.o: $(SRCDIR)/%.c | $(BUILDDIR)
	$(CC) $(CFLAGS) -c $< -o $@

# Create build directory if it doesn't exist
$(BUILDDIR):
	mkdir -p $(BUILDDIR)

# Clean up
clean:
	rm -rf $(BUILDDIR) $(TARGET)

# Phony targets
.PHONY: all clean
