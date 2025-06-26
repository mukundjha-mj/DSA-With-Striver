#!/bin/bash

# Check if git user.email is already set correctly
EMAIL_SET=$(git config --global user.email)

if [ "$EMAIL_SET" != "mukundjha204@gmail.com" ]; then
  echo "🔧 Setting up Git config..."

  git config --global user.name "mukundjha-mj"
  git config --global user.email "mukundjha204@gmail.com"

  echo "✅ Git config set."
else
  echo "✅ Git config already set to $EMAIL_SET"
fi
