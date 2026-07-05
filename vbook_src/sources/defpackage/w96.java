package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w96  reason: default package */
/* loaded from: classes3.dex */
public final class w96 {
    public final Set a = b00.F0(new String[]{"if", "else", "when", "for", "while", "do", "return", "break", "continue", "package", "import", "class", "interface", "fun", "val", "var", "object", "companion", "data", "sealed", "enum", "annotation", "typealias", "abstract", "open", "override", "final", "private", "protected", "public", "internal", "lateinit", "const", "inline", "noinline", "crossinline", "reified", "suspend", "tailrec", "operator", "infix", "external", "expect", "actual", "this", "super", "null", "true", "false", "is", "in", "as", "try", "catch", "finally", "throw", "constructor", "init", "by", "where", "out", "get", "set", "field", "it"});
    public final Set b = b00.F0(new String[]{"Unit", "Nothing", "Any", "Boolean", "Byte", "Short", "Int", "Long", "Float", "Double", "Char", "String", "Array", "List", "Set", "Map", "Pair", "Triple", "Sequence", "IntArray", "LongArray", "FloatArray", "DoubleArray", "BooleanArray", "CharArray", "ByteArray", "ShortArray", "Collection", "Iterable", "Iterator", "MutableList", "MutableSet", "MutableMap", "Number", "Comparable", "Throwable", "Exception", "Error"});

    public final yk8 a(String str, int i, char c) {
        int i2 = i + 1;
        boolean z = false;
        while (i2 < str.length()) {
            if (z) {
                z = false;
            } else if (str.charAt(i2) == '\\') {
                z = true;
            } else if (str.charAt(i2) == c) {
                return new yk8(Integer.valueOf(i2 + 1), Boolean.FALSE);
            }
            i2++;
        }
        return new yk8(Integer.valueOf(i2), Boolean.FALSE);
    }
}
