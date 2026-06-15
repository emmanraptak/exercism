class MicroBlog {
    public String truncate(String input) {
        int codePointCount = input.codePointCount(0, input.length());
        int limit = Math.min(codePointCount, 5);
        int endIndex = input.offsetByCodePoints(0, limit);
        return input.substring(0, endIndex);
    }
}
