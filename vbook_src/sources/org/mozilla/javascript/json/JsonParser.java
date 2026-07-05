package org.mozilla.javascript.json;

import java.util.ArrayList;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class JsonParser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Context cx;
    private int length;
    private int pos;
    private Scriptable scope;
    private String src;

    public JsonParser(Context context, Scriptable scriptable) {
        this.cx = context;
        this.scope = scriptable;
    }

    private void consume(char c) {
        consumeWhitespace();
        int i = this.pos;
        if (i < this.length) {
            String str = this.src;
            this.pos = i + 1;
            char charAt = str.charAt(i);
            if (charAt == c) {
                return;
            }
            throw new ParseException("Expected " + c + " found " + charAt);
        }
        throw new ParseException("Expected " + c + " but reached end of stream");
    }

    private void consumeWhitespace() {
        while (true) {
            int i = this.pos;
            if (i < this.length) {
                char charAt = this.src.charAt(i);
                if (charAt == '\t' || charAt == '\n' || charAt == '\r' || charAt == ' ') {
                    this.pos++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private static int fromHex(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        return -1;
    }

    private char nextOrNumberError(int i) {
        int i2 = this.pos;
        int i3 = this.length;
        if (i2 < i3) {
            String str = this.src;
            this.pos = i2 + 1;
            return str.charAt(i2);
        }
        throw numberError(i, i3);
    }

    private ParseException numberError(int i, int i2) {
        return new ParseException("Unsupported number format: ".concat(this.src.substring(i, i2)));
    }

    private Object readArray() {
        consumeWhitespace();
        int i = this.pos;
        if (i < this.length && this.src.charAt(i) == ']') {
            this.pos++;
            return this.cx.newArray(this.scope, 0);
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (true) {
            int i2 = this.pos;
            if (i2 < this.length) {
                char charAt = this.src.charAt(i2);
                if (charAt != ',') {
                    if (charAt != ']') {
                        if (!z) {
                            arrayList.add(readValue());
                            z = true;
                        } else {
                            throw new ParseException("Missing comma in array literal");
                        }
                    } else if (z) {
                        this.pos++;
                        return this.cx.newArray(this.scope, arrayList.toArray());
                    } else {
                        throw new ParseException("Unexpected comma in array literal");
                    }
                } else if (z) {
                    this.pos++;
                    z = false;
                } else {
                    throw new ParseException("Unexpected comma in array literal");
                }
                consumeWhitespace();
            } else {
                throw new ParseException("Unterminated array literal");
            }
        }
    }

    private void readDigits() {
        char charAt;
        while (true) {
            int i = this.pos;
            if (i < this.length && (charAt = this.src.charAt(i)) >= '0' && charAt <= '9') {
                this.pos++;
            } else {
                return;
            }
        }
    }

    private Boolean readFalse() {
        int i = this.length;
        int i2 = this.pos;
        if (i - i2 >= 4 && this.src.charAt(i2) == 'a' && this.src.charAt(this.pos + 1) == 'l' && this.src.charAt(this.pos + 2) == 's' && this.src.charAt(this.pos + 3) == 'e') {
            this.pos += 4;
            return Boolean.FALSE;
        }
        throw new ParseException("Unexpected token: f");
    }

    private Object readNull() {
        int i = this.length;
        int i2 = this.pos;
        if (i - i2 >= 3 && this.src.charAt(i2) == 'u' && this.src.charAt(this.pos + 1) == 'l' && this.src.charAt(this.pos + 2) == 'l') {
            this.pos += 3;
            return null;
        }
        throw new ParseException("Unexpected token: n");
    }

    private Number readNumber(char c) {
        char charAt;
        int i = this.pos - 1;
        if (c == '-' && ((c = nextOrNumberError(i)) < '0' || c > '9')) {
            throw numberError(i, this.pos);
        }
        if (c != '0') {
            readDigits();
        }
        int i2 = this.pos;
        if (i2 < this.length && this.src.charAt(i2) == '.') {
            this.pos++;
            char nextOrNumberError = nextOrNumberError(i);
            if (nextOrNumberError >= '0' && nextOrNumberError <= '9') {
                readDigits();
            } else {
                throw numberError(i, this.pos);
            }
        }
        int i3 = this.pos;
        if (i3 < this.length && ((charAt = this.src.charAt(i3)) == 'e' || charAt == 'E')) {
            this.pos++;
            char nextOrNumberError2 = nextOrNumberError(i);
            if (nextOrNumberError2 == '-' || nextOrNumberError2 == '+') {
                nextOrNumberError2 = nextOrNumberError(i);
            }
            if (nextOrNumberError2 >= '0' && nextOrNumberError2 <= '9') {
                readDigits();
            } else {
                throw numberError(i, this.pos);
            }
        }
        double parseDouble = Double.parseDouble(this.src.substring(i, this.pos));
        int i4 = (int) parseDouble;
        if (i4 == parseDouble) {
            return Integer.valueOf(i4);
        }
        return Double.valueOf(parseDouble);
    }

    private Object readObject() {
        consumeWhitespace();
        Scriptable newObject = this.cx.newObject(this.scope);
        int i = this.pos;
        if (i < this.length && this.src.charAt(i) == '}') {
            this.pos++;
            return newObject;
        }
        boolean z = false;
        while (true) {
            int i2 = this.pos;
            if (i2 < this.length) {
                String str = this.src;
                this.pos = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt != '\"') {
                    if (charAt != ',') {
                        if (charAt == '}') {
                            if (z) {
                                return newObject;
                            }
                            throw new ParseException("Unexpected comma in object literal");
                        }
                        throw new ParseException("Unexpected token in object literal");
                    } else if (z) {
                        z = false;
                    } else {
                        throw new ParseException("Unexpected comma in object literal");
                    }
                } else if (!z) {
                    String readString = readString();
                    consume(':');
                    Object readValue = readValue();
                    ScriptRuntime.StringIdOrIndex stringIdOrIndex = ScriptRuntime.toStringIdOrIndex(readString);
                    if (stringIdOrIndex.getStringId() == null) {
                        newObject.put(stringIdOrIndex.getIndex(), newObject, readValue);
                    } else {
                        newObject.put(stringIdOrIndex.getStringId(), newObject, readValue);
                    }
                    z = true;
                } else {
                    throw new ParseException("Missing comma in object literal");
                }
                consumeWhitespace();
            } else {
                throw new ParseException("Unterminated object literal");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0037, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String readString() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.json.JsonParser.readString():java.lang.String");
    }

    private Boolean readTrue() {
        int i = this.length;
        int i2 = this.pos;
        if (i - i2 >= 3 && this.src.charAt(i2) == 'r' && this.src.charAt(this.pos + 1) == 'u' && this.src.charAt(this.pos + 2) == 'e') {
            this.pos += 3;
            return Boolean.TRUE;
        }
        throw new ParseException("Unexpected token: t");
    }

    private Object readValue() {
        consumeWhitespace();
        int i = this.pos;
        if (i < this.length) {
            String str = this.src;
            this.pos = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '\"') {
                if (charAt != '-') {
                    if (charAt != '[') {
                        if (charAt != 'f') {
                            if (charAt != 'n') {
                                if (charAt != 't') {
                                    if (charAt != '{') {
                                        switch (charAt) {
                                            case Token.THIS /* 48 */:
                                            case Token.FALSE /* 49 */:
                                            case Token.TRUE /* 50 */:
                                            case Token.SHEQ /* 51 */:
                                            case Token.SHNE /* 52 */:
                                            case Token.REGEXP /* 53 */:
                                            case Token.BINDNAME /* 54 */:
                                            case Token.THROW /* 55 */:
                                            case Token.RETHROW /* 56 */:
                                            case Token.IN /* 57 */:
                                                break;
                                            default:
                                                throw new ParseException("Unexpected token: " + charAt);
                                        }
                                    } else {
                                        return readObject();
                                    }
                                } else {
                                    return readTrue();
                                }
                            } else {
                                return readNull();
                            }
                        } else {
                            return readFalse();
                        }
                    } else {
                        return readArray();
                    }
                }
                return readNumber(charAt);
            }
            return readString();
        }
        throw new ParseException("Empty JSON string");
    }

    public synchronized Object parseValue(String str) {
        Object readValue;
        try {
            if (str != null) {
                this.pos = 0;
                this.length = str.length();
                this.src = str;
                readValue = readValue();
                consumeWhitespace();
                if (this.pos < this.length) {
                    int i = this.pos;
                    throw new ParseException("Expected end of stream at char " + i);
                }
            } else {
                throw new ParseException("Input string may not be null");
            }
        } catch (Throwable th) {
            throw th;
        }
        return readValue;
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public static class ParseException extends Exception {
        private static final long serialVersionUID = 4804542791749920772L;

        public ParseException(String str) {
            super(str);
        }

        public ParseException(Exception exc) {
            super(exc);
        }
    }
}
