package org.mozilla.javascript;

import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.util.HashMap;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class TokenStream implements Parser.CurrentPositionReporter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char BYTE_ORDER_MARK = 65279;
    private static final int EOF_CHAR = -1;
    private static final char NUMERIC_SEPARATOR = '_';
    private static final int REPORT_NUMBER_FORMAT_ERROR = -2;
    private BigInteger bigInt;
    Token.CommentType commentType;
    int cursor;
    private boolean dirtyLine;
    private boolean isBinary;
    private boolean isHex;
    private boolean isOctal;
    private boolean isOldOctal;
    private int lastLineEnd;
    int lineno;
    private double number;
    private Parser parser;
    private int quoteChar;
    String regExpFlags;
    private char[] sourceBuffer;
    int sourceCursor;
    private int sourceEnd;
    private Reader sourceReader;
    private String sourceString;
    private int stringBufferTop;
    int tokenBeg;
    int tokenEnd;
    private int tokenStartLastLineEnd;
    private int tokenStartLineno;
    private int ungetCursor;
    private boolean xmlIsAttribute;
    private boolean xmlIsTagContent;
    private int xmlOpenTagsCount;
    private StringBuilder rawString = new StringBuilder();
    private String string = "";
    private char[] stringBuffer = new char[Token.CASE];
    private final HashMap<String, String> allStrings = new HashMap<>();
    private final int[] ungetBuffer = new int[3];
    private boolean hitEOF = false;
    private int lineStart = 0;
    private int lineEndChar = -1;
    private String commentPrefix = "";
    private int commentCursor = -1;

    public TokenStream(Parser parser, Reader reader, String str, int i) {
        this.parser = parser;
        this.lineno = i;
        if (reader != null) {
            if (str != null) {
                Kit.codeBug();
            }
            this.sourceReader = reader;
            this.sourceBuffer = new char[512];
            this.sourceEnd = 0;
        } else {
            if (str == null) {
                Kit.codeBug();
            }
            this.sourceString = str;
            this.sourceEnd = str.length();
        }
        this.cursor = 0;
        this.sourceCursor = 0;
    }

    private void addToString(int i) {
        int i2 = this.stringBufferTop;
        int charCount = Character.charCount(i);
        int i3 = i2 + charCount;
        char[] cArr = this.stringBuffer;
        if (i3 >= cArr.length) {
            char[] cArr2 = new char[cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            this.stringBuffer = cArr2;
        }
        char[] cArr3 = this.stringBuffer;
        if (charCount == 1) {
            cArr3[i2] = (char) i;
        } else {
            cArr3[i2] = Character.highSurrogate(i);
            this.stringBuffer[i2 + 1] = Character.lowSurrogate(i);
        }
        this.stringBufferTop = i3;
    }

    private boolean canUngetChar() {
        int i = this.ungetCursor;
        if (i == 0 || this.ungetBuffer[i - 1] != 10) {
            return true;
        }
        return false;
    }

    private final int charAt(int i) {
        if (i < 0) {
            return -1;
        }
        String str = this.sourceString;
        int i2 = this.sourceEnd;
        if (str != null) {
            if (i >= i2) {
                return -1;
            }
            return str.charAt(i);
        }
        if (i >= i2) {
            int i3 = this.sourceCursor;
            try {
                if (!fillSourceBuffer()) {
                    return -1;
                }
                i -= i3 - this.sourceCursor;
            } catch (IOException unused) {
                return -1;
            }
        }
        return this.sourceBuffer[i];
    }

    private static String convertLastCharToHex(String str) {
        int length = str.length() - 1;
        StringBuilder sb = new StringBuilder(str.substring(0, length));
        sb.append("\\u");
        String hexString = Integer.toHexString(str.charAt(length));
        for (int i = 0; i < 4 - hexString.length(); i++) {
            sb.append('0');
        }
        sb.append(hexString);
        return sb.toString();
    }

    private boolean fillSourceBuffer() {
        if (this.sourceString != null) {
            Kit.codeBug();
        }
        if (this.sourceEnd == this.sourceBuffer.length) {
            if (this.lineStart != 0 && !isMarkingComment()) {
                char[] cArr = this.sourceBuffer;
                int i = this.lineStart;
                System.arraycopy(cArr, i, cArr, 0, this.sourceEnd - i);
                int i2 = this.sourceEnd;
                int i3 = this.lineStart;
                this.sourceEnd = i2 - i3;
                this.sourceCursor -= i3;
                this.lineStart = 0;
            } else {
                char[] cArr2 = this.sourceBuffer;
                char[] cArr3 = new char[cArr2.length * 2];
                System.arraycopy(cArr2, 0, cArr3, 0, this.sourceEnd);
                this.sourceBuffer = cArr3;
            }
        }
        Reader reader = this.sourceReader;
        char[] cArr4 = this.sourceBuffer;
        int i4 = this.sourceEnd;
        int read = reader.read(cArr4, i4, cArr4.length - i4);
        if (read < 0) {
            return false;
        }
        this.sourceEnd += read;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
        if (org.mozilla.javascript.ScriptRuntime.isJSLineTerminator(r0) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
        r6.lineEndChar = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
        return 10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getChar(boolean r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.ungetCursor
            r1 = 1
            if (r0 == 0) goto L12
            int r7 = r6.cursor
            int r7 = r7 + r1
            r6.cursor = r7
            int[] r7 = r6.ungetBuffer
            int r0 = r0 - r1
            r6.ungetCursor = r0
            r6 = r7[r0]
            return r6
        L12:
            java.lang.String r0 = r6.sourceString
            int r2 = r6.sourceCursor
            r3 = -1
            if (r0 == 0) goto L33
            int r4 = r6.sourceEnd
            if (r2 != r4) goto L20
            r6.hitEOF = r1
            return r3
        L20:
            int r4 = r6.cursor
            int r4 = r4 + r1
            r6.cursor = r4
            int r0 = r0.codePointAt(r2)
            int r2 = r6.sourceCursor
            int r4 = java.lang.Character.charCount(r0)
            int r4 = r4 + r2
            r6.sourceCursor = r4
            goto L4f
        L33:
            int r0 = r6.sourceEnd
            if (r2 != r0) goto L40
            boolean r0 = r6.fillSourceBuffer()
            if (r0 != 0) goto L40
            r6.hitEOF = r1
            return r3
        L40:
            int r0 = r6.cursor
            int r0 = r0 + r1
            r6.cursor = r0
            char[] r0 = r6.sourceBuffer
            int r2 = r6.sourceCursor
            int r4 = r2 + 1
            r6.sourceCursor = r4
            char r0 = r0[r2]
        L4f:
            r2 = 13
            r4 = 10
            if (r8 != 0) goto L70
            int r5 = r6.lineEndChar
            if (r5 < 0) goto L70
            if (r5 != r2) goto L60
            if (r0 != r4) goto L60
            r6.lineEndChar = r4
            goto L12
        L60:
            r6.lineEndChar = r3
            int r3 = r6.sourceCursor
            int r3 = r3 - r1
            r6.lineStart = r3
            int r3 = r6.tokenEnd
            r6.lastLineEnd = r3
            int r3 = r6.lineno
            int r3 = r3 + r1
            r6.lineno = r3
        L70:
            r3 = 127(0x7f, float:1.78E-43)
            if (r0 > r3) goto L7b
            if (r0 == r4) goto L78
            if (r0 != r2) goto L93
        L78:
            r6.lineEndChar = r0
            return r4
        L7b:
            r2 = 65279(0xfeff, float:9.1475E-41)
            if (r0 != r2) goto L81
            goto L93
        L81:
            if (r7 == 0) goto L8a
            boolean r2 = isJSFormatChar(r0)
            if (r2 == 0) goto L8a
            goto L12
        L8a:
            boolean r7 = org.mozilla.javascript.ScriptRuntime.isJSLineTerminator(r0)
            if (r7 == 0) goto L93
            r6.lineEndChar = r0
            return r4
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.getChar(boolean, boolean):int");
    }

    private int getCharIgnoreLineEnd() {
        return getChar(true, true);
    }

    private String getStringFromBuffer() {
        this.tokenEnd = this.cursor;
        return new String(this.stringBuffer, 0, this.stringBufferTop);
    }

    private int getTemplateLiteralChar() {
        int charIgnoreLineEnd = getCharIgnoreLineEnd(false);
        if (charIgnoreLineEnd == 10) {
            int i = this.lineEndChar;
            if (i != 13) {
                if (i == 8232 || i == 8233) {
                    charIgnoreLineEnd = i;
                }
            } else if (charAt(this.cursor) == 10) {
                getCharIgnoreLineEnd(false);
            }
            this.lineEndChar = -1;
            this.lineStart = this.sourceCursor - 1;
            this.lineno++;
        }
        this.rawString.append((char) charIgnoreLineEnd);
        return charIgnoreLineEnd;
    }

    private String internString(String str) {
        String putIfAbsent = this.allStrings.putIfAbsent(str, str);
        if (putIfAbsent == null) {
            return str;
        }
        return putIfAbsent;
    }

    private static boolean isAlpha(int i) {
        if (i <= 90) {
            if (65 > i) {
                return false;
            }
            return true;
        } else if (97 > i || i > 122) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean isDigit(int i, int i2) {
        if (i != 10 || !isDigit(i2)) {
            if (i != 16 || !isHexDigit(i2)) {
                if (i != 8 || !isOctalDigit(i2)) {
                    if (i == 2 && isDualDigit(i2)) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    private static boolean isDualDigit(int i) {
        if (48 != i && i != 49) {
            return false;
        }
        return true;
    }

    private static boolean isHexDigit(int i) {
        if (48 > i || i > 57) {
            if (97 > i || i > 102) {
                if (65 <= i && i <= 70) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    private static boolean isJSFormatChar(int i) {
        if (i > 127 && Character.getType((char) i) == 16) {
            return true;
        }
        return false;
    }

    private static boolean isJSSpace(int i) {
        if (i <= 127) {
            if (i == 32 || i == 9 || i == 12 || i == 11) {
                return true;
            }
            return false;
        } else if (i == 160 || i == 65279 || Character.getType((char) i) == 12) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isKeyword(String str, int i, boolean z) {
        if (stringToKeyword(str, i, z) != 0) {
            return true;
        }
        return false;
    }

    private boolean isMarkingComment() {
        if (this.commentCursor != -1) {
            return true;
        }
        return false;
    }

    private static boolean isOctalDigit(int i) {
        if (48 <= i && i <= 55) {
            return true;
        }
        return false;
    }

    private static boolean isValidIdentifierName(String str) {
        int[] array = str.codePoints().toArray();
        int length = array.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = array[i];
            int i4 = i2 + 1;
            if (i2 == 0) {
                if (i3 != 36 && i3 != 95 && !Character.isUnicodeIdentifierStart(i3)) {
                    return false;
                }
            } else if (i3 != 36 && i3 != 8204 && i3 != 8205 && !Character.isUnicodeIdentifierPart(i3)) {
                return false;
            }
            i++;
            i2 = i4;
        }
        return true;
    }

    private void markCommentStart(String str) {
        if (this.parser.compilerEnv.isRecordingComments() && this.sourceReader != null) {
            this.commentPrefix = str;
            this.commentCursor = this.sourceCursor - 1;
        }
    }

    private boolean matchChar(int i) {
        int charIgnoreLineEnd = getCharIgnoreLineEnd();
        if (charIgnoreLineEnd == i) {
            this.tokenEnd = this.cursor;
            return true;
        }
        ungetCharIgnoreLineEnd(charIgnoreLineEnd);
        return false;
    }

    private boolean matchTemplateLiteralChar(int i) {
        int templateLiteralChar = getTemplateLiteralChar();
        if (templateLiteralChar == i) {
            return true;
        }
        ungetTemplateLiteralChar(templateLiteralChar);
        return false;
    }

    private int peekChar() {
        int i = getChar();
        ungetChar(i);
        return i;
    }

    private int peekTemplateLiteralChar() {
        int templateLiteralChar = getTemplateLiteralChar();
        ungetTemplateLiteralChar(templateLiteralChar);
        return templateLiteralChar;
    }

    private boolean readCDATA() {
        int i = getChar();
        while (i != -1) {
            addToString(i);
            if (i == 93 && peekChar() == 93) {
                i = getChar();
                addToString(i);
                if (peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                i = getChar();
            }
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private int readDigits(int i, int i2) {
        if (isDigit(i, i2)) {
            addToString(i2);
            i2 = getChar();
            if (i2 != -1) {
                while (true) {
                    if (i2 == 95) {
                        i2 = getChar();
                        if (i2 != 10 && i2 != -1) {
                            if (!isDigit(i, i2)) {
                                ungetChar(i2);
                                return 95;
                            }
                            addToString(95);
                        } else {
                            return -2;
                        }
                    } else if (!isDigit(i, i2)) {
                        break;
                    } else {
                        addToString(i2);
                        i2 = getChar();
                        if (i2 == -1) {
                            return -1;
                        }
                    }
                }
            } else {
                return -1;
            }
        }
        return i2;
    }

    private boolean readEntity() {
        int i = getChar();
        int i2 = 1;
        while (i != -1) {
            addToString(i);
            if (i != 60) {
                if (i == 62 && i2 - 1 == 0) {
                    return true;
                }
            } else {
                i2++;
            }
            i = getChar();
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private boolean readPI() {
        while (true) {
            int i = getChar();
            if (i != -1) {
                addToString(i);
                if (i == 63 && peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return false;
            }
        }
    }

    private boolean readQuotedString(int i) {
        int i2;
        do {
            i2 = getChar();
            if (i2 != -1) {
                addToString(i2);
            } else {
                this.stringBufferTop = 0;
                this.string = null;
                this.parser.addError("msg.XML.bad.form");
                return false;
            }
        } while (i2 != i);
        return true;
    }

    private boolean readXmlComment() {
        int i = getChar();
        while (i != -1) {
            addToString(i);
            if (i == 45 && peekChar() == 45) {
                i = getChar();
                addToString(i);
                if (peekChar() == 62) {
                    addToString(getChar());
                    return true;
                }
            } else {
                i = getChar();
            }
        }
        this.stringBufferTop = 0;
        this.string = null;
        this.parser.addError("msg.XML.bad.form");
        return false;
    }

    private void skipLine() {
        int i;
        do {
            i = getChar();
            if (i == -1) {
                break;
            }
        } while (i != 10);
        ungetChar(i);
        this.tokenEnd = this.cursor;
    }

    private static int stringToKeyword(String str, int i, boolean z) {
        if (i < 200) {
            return stringToKeywordForJS(str);
        }
        return stringToKeywordForES(str, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0295, code lost:
        if (r8 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x02e8, code lost:
        if (r8 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x02ee, code lost:
        if (r8 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x02f1, code lost:
        if (r8 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02fa, code lost:
        if (r8 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x02fd, code lost:
        if (r8 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0302, code lost:
        if (r8 != false) goto L149;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int stringToKeywordForES(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.stringToKeywordForES(java.lang.String, boolean):int");
    }

    private static int stringToKeywordForJS(String str) {
        str.getClass();
        int i = 58;
        char c = 65535;
        switch (str.hashCode()) {
            case -1888027236:
                if (str.equals("volatile")) {
                    c = 0;
                    break;
                }
                break;
            case -1466596076:
                if (str.equals("synchronized")) {
                    c = 1;
                    break;
                }
                break;
            case -1335458389:
                if (str.equals("delete")) {
                    c = 2;
                    break;
                }
                break;
            case -1325958191:
                if (str.equals("double")) {
                    c = 3;
                    break;
                }
                break;
            case -1305664359:
                if (str.equals("extends")) {
                    c = 4;
                    break;
                }
                break;
            case -1289153612:
                if (str.equals("export")) {
                    c = 5;
                    break;
                }
                break;
            case -1184795739:
                if (str.equals("import")) {
                    c = 6;
                    break;
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    c = 7;
                    break;
                }
                break;
            case -977423767:
                if (str.equals("public")) {
                    c = '\b';
                    break;
                }
                break;
            case -934396624:
                if (str.equals("return")) {
                    c = '\t';
                    break;
                }
                break;
            case -915384400:
                if (str.equals("implements")) {
                    c = '\n';
                    break;
                }
                break;
            case -892481938:
                if (str.equals("static")) {
                    c = 11;
                    break;
                }
                break;
            case -889473228:
                if (str.equals("switch")) {
                    c = '\f';
                    break;
                }
                break;
            case -874432947:
                if (str.equals("throws")) {
                    c = '\r';
                    break;
                }
                break;
            case -858802543:
                if (str.equals("typeof")) {
                    c = 14;
                    break;
                }
                break;
            case -853259901:
                if (str.equals("finally")) {
                    c = 15;
                    break;
                }
                break;
            case -807062458:
                if (str.equals("package")) {
                    c = 16;
                    break;
                }
                break;
            case -608539730:
                if (str.equals("protected")) {
                    c = 17;
                    break;
                }
                break;
            case -567202649:
                if (str.equals("continue")) {
                    c = 18;
                    break;
                }
                break;
            case -314497661:
                if (str.equals("private")) {
                    c = 19;
                    break;
                }
                break;
            case 3211:
                if (str.equals("do")) {
                    c = 20;
                    break;
                }
                break;
            case 3357:
                if (str.equals("if")) {
                    c = 21;
                    break;
                }
                break;
            case 3365:
                if (str.equals("in")) {
                    c = 22;
                    break;
                }
                break;
            case 101577:
                if (str.equals("for")) {
                    c = 23;
                    break;
                }
                break;
            case 104431:
                if (str.equals("int")) {
                    c = 24;
                    break;
                }
                break;
            case 107035:
                if (str.equals("let")) {
                    c = 25;
                    break;
                }
                break;
            case 108960:
                if (str.equals("new")) {
                    c = 26;
                    break;
                }
                break;
            case 115131:
                if (str.equals("try")) {
                    c = 27;
                    break;
                }
                break;
            case 116519:
                if (str.equals("var")) {
                    c = 28;
                    break;
                }
                break;
            case 3039496:
                if (str.equals("byte")) {
                    c = 29;
                    break;
                }
                break;
            case 3046192:
                if (str.equals("case")) {
                    c = 30;
                    break;
                }
                break;
            case 3052374:
                if (str.equals("char")) {
                    c = 31;
                    break;
                }
                break;
            case 3116345:
                if (str.equals("else")) {
                    c = ' ';
                    break;
                }
                break;
            case 3118337:
                if (str.equals("enum")) {
                    c = '!';
                    break;
                }
                break;
            case 3178851:
                if (str.equals("goto")) {
                    c = '\"';
                    break;
                }
                break;
            case 3327612:
                if (str.equals("long")) {
                    c = '#';
                    break;
                }
                break;
            case 3392903:
                if (str.equals("null")) {
                    c = '$';
                    break;
                }
                break;
            case 3559070:
                if (str.equals("this")) {
                    c = '%';
                    break;
                }
                break;
            case 3569038:
                if (str.equals("true")) {
                    c = '&';
                    break;
                }
                break;
            case 3625364:
                if (str.equals("void")) {
                    c = '\'';
                    break;
                }
                break;
            case 3649734:
                if (str.equals("with")) {
                    c = '(';
                    break;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    c = ')';
                    break;
                }
                break;
            case 94001407:
                if (str.equals("break")) {
                    c = '*';
                    break;
                }
                break;
            case 94432955:
                if (str.equals("catch")) {
                    c = '+';
                    break;
                }
                break;
            case 94742904:
                if (str.equals("class")) {
                    c = ',';
                    break;
                }
                break;
            case 94844771:
                if (str.equals("const")) {
                    c = '-';
                    break;
                }
                break;
            case 97196323:
                if (str.equals("false")) {
                    c = '.';
                    break;
                }
                break;
            case 97436022:
                if (str.equals("final")) {
                    c = '/';
                    break;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    c = '0';
                    break;
                }
                break;
            case 109413500:
                if (str.equals("short")) {
                    c = '1';
                    break;
                }
                break;
            case 109801339:
                if (str.equals("super")) {
                    c = '2';
                    break;
                }
                break;
            case 110339814:
                if (str.equals("throw")) {
                    c = '3';
                    break;
                }
                break;
            case 113101617:
                if (str.equals("while")) {
                    c = '4';
                    break;
                }
                break;
            case 114974605:
                if (str.equals("yield")) {
                    c = '5';
                    break;
                }
                break;
            case 502623545:
                if (str.equals("interface")) {
                    c = '6';
                    break;
                }
                break;
            case 547812385:
                if (str.equals("debugger")) {
                    c = '7';
                    break;
                }
                break;
            case 902025516:
                if (str.equals("instanceof")) {
                    c = '8';
                    break;
                }
                break;
            case 1052746378:
                if (str.equals("transient")) {
                    c = '9';
                    break;
                }
                break;
            case 1380938712:
                if (str.equals("function")) {
                    c = ':';
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c = ';';
                    break;
                }
                break;
            case 1732898850:
                if (str.equals("abstract")) {
                    c = '<';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\n':
            case 11:
            case '\r':
            case 16:
            case 17:
            case 19:
            case 24:
            case 29:
            case 31:
            case Token.GETPROP /* 33 */:
            case Token.GETPROPNOWARN /* 34 */:
            case Token.GETPROP_SUPER /* 35 */:
            case Token.SETELEM /* 41 */:
            case Token.NAME /* 44 */:
            case Token.NULL /* 47 */:
            case Token.THIS /* 48 */:
            case Token.FALSE /* 49 */:
            case Token.TRUE /* 50 */:
            case Token.BINDNAME /* 54 */:
            case Token.IN /* 57 */:
            case Token.GETVAR /* 60 */:
                i = 140;
                break;
            case 2:
                i = 31;
                break;
            case '\t':
                i = 4;
                break;
            case '\f':
                i = Token.SWITCH;
                break;
            case 14:
                i = 32;
                break;
            case 15:
                i = Token.FINALLY;
                break;
            case 18:
                i = Token.CONTINUE;
                break;
            case 20:
                i = Token.DO;
                break;
            case 21:
                i = Token.IF;
                break;
            case 22:
                i = 57;
                break;
            case 23:
                i = Token.FOR;
                break;
            case 25:
                i = Token.LET;
                break;
            case 26:
                i = 30;
                break;
            case 27:
                i = 90;
                break;
            case 28:
                i = Token.VAR;
                break;
            case 30:
                i = Token.CASE;
                break;
            case ' ':
                i = Token.ELSE;
                break;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                i = 47;
                break;
            case Token.SETPROP /* 37 */:
                i = 48;
                break;
            case Token.SETPROP_SUPER /* 38 */:
                i = 50;
                break;
            case Token.GETELEM /* 39 */:
                i = Token.VOID;
                break;
            case Token.GETELEM_SUPER /* 40 */:
                i = Token.WITH;
                break;
            case Token.SETELEM_SUPER /* 42 */:
                i = Token.BREAK;
                break;
            case Token.CALL /* 43 */:
                i = Token.CATCH;
                break;
            case Token.NUMBER /* 45 */:
                i = Token.CONST;
                break;
            case Token.STRING /* 46 */:
                i = 49;
                break;
            case Token.SHEQ /* 51 */:
                i = 55;
                break;
            case Token.SHNE /* 52 */:
                i = 130;
                break;
            case Token.REGEXP /* 53 */:
                i = 78;
                break;
            case Token.THROW /* 55 */:
                i = Token.DEBUGGER;
                break;
            case Token.RETHROW /* 56 */:
                break;
            case Token.INSTANCEOF /* 58 */:
                i = Token.FUNCTION;
                break;
            case Token.LOCAL_LOAD /* 59 */:
                i = Token.DEFAULT;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 0;
        }
        return i & 255;
    }

    private final String substring(int i, int i2) {
        String str = this.sourceString;
        if (str != null) {
            return str.substring(i, i2);
        }
        return new String(this.sourceBuffer, i, i2 - i);
    }

    private void ungetChar(int i) {
        int i2 = this.ungetCursor;
        if (i2 != 0 && this.ungetBuffer[i2 - 1] == 10) {
            Kit.codeBug();
        }
        int[] iArr = this.ungetBuffer;
        int i3 = this.ungetCursor;
        this.ungetCursor = i3 + 1;
        iArr[i3] = i;
        this.cursor--;
    }

    private void ungetCharIgnoreLineEnd(int i) {
        int[] iArr = this.ungetBuffer;
        int i2 = this.ungetCursor;
        this.ungetCursor = i2 + 1;
        iArr[i2] = i;
        this.cursor--;
    }

    private void ungetTemplateLiteralChar(int i) {
        ungetCharIgnoreLineEnd(i);
        StringBuilder sb = this.rawString;
        sb.setLength(sb.length() - 1);
    }

    public final boolean eof() {
        return this.hitEOF;
    }

    public final String getAndResetCurrentComment() {
        if (this.sourceString != null) {
            if (isMarkingComment()) {
                Kit.codeBug();
            }
            return this.sourceString.substring(this.tokenBeg, this.tokenEnd);
        }
        if (!isMarkingComment()) {
            Kit.codeBug();
        }
        StringBuilder sb = new StringBuilder(this.commentPrefix);
        sb.append(this.sourceBuffer, this.commentCursor, getTokenLength() - this.commentPrefix.length());
        this.commentCursor = -1;
        return sb.toString();
    }

    public final BigInteger getBigInt() {
        return this.bigInt;
    }

    public Token.CommentType getCommentType() {
        return this.commentType;
    }

    public int getCursor() {
        return this.cursor;
    }

    public int getFirstXMLToken() {
        this.xmlOpenTagsCount = 0;
        this.xmlIsAttribute = false;
        this.xmlIsTagContent = false;
        if (!canUngetChar()) {
            return -1;
        }
        ungetChar(60);
        return getNextXMLToken();
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getLength() {
        return this.tokenEnd - this.tokenBeg;
    }

    public final String getLine(int i, int[] iArr) {
        int i2;
        int i3 = (this.cursor + this.ungetCursor) - i;
        int i4 = this.sourceCursor;
        if (i3 > i4) {
            return null;
        }
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            int charAt = charAt(i4 - 1);
            if (ScriptRuntime.isJSLineTerminator(charAt)) {
                if (charAt == 10 && charAt(i4 - 2) == 13) {
                    i3--;
                    i4--;
                }
                i5++;
                i6 = i4 - 1;
            }
            i3--;
            i4--;
        }
        int i7 = 0;
        while (true) {
            if (i4 > 0) {
                if (ScriptRuntime.isJSLineTerminator(charAt(i4 - 1))) {
                    break;
                }
                i4--;
                i7++;
            } else {
                i4 = 0;
                break;
            }
        }
        int i8 = this.lineno - i5;
        if (this.lineEndChar >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        iArr[0] = i8 + i2;
        iArr[1] = i7;
        if (i5 == 0) {
            return getLine();
        }
        return substring(i4, i6);
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getLineno() {
        return this.lineno;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getNextXMLToken() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.getNextXMLToken():int");
    }

    public final double getNumber() {
        return this.number;
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getOffset() {
        int i = this.sourceCursor - this.lineStart;
        if (this.lineEndChar >= 0) {
            return i - 1;
        }
        return i;
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public int getPosition() {
        return this.tokenBeg;
    }

    public final char getQuoteChar() {
        return (char) this.quoteChar;
    }

    public String getRawString() {
        if (this.rawString.length() == 0) {
            return "";
        }
        return this.rawString.toString();
    }

    public final String getSourceString() {
        return this.sourceString;
    }

    public final String getString() {
        return this.string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0176, code lost:
        r7 = "yield";
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0178, code lost:
        r30.string = r7;
        r7 = 44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
        r30.string = internString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0183, code lost:
        if (r7 == 140) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x018e, code lost:
        if (r30.parser.compilerEnv.getLanguageVersion() < 200) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0199, code lost:
        if (r30.parser.compilerEnv.isReservedKeywordAsIdentifier() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019b, code lost:
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x019c, code lost:
        if (r1 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a6, code lost:
        if (r30.parser.compilerEnv.getLanguageVersion() < 200) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ac, code lost:
        if (isValidIdentifierName(r4) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ae, code lost:
        r30.parser.reportError("msg.invalid.escape");
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01b3, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01b4, code lost:
        r30.string = internString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ba, code lost:
        return 44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
        r30.parser.reportError("msg.invalid.escape");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011a, code lost:
        ungetChar(r12);
        r4 = getStringFromBuffer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0123, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
        if (r30.parser.compilerEnv.getLanguageVersion() < 200) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0142, code lost:
        if (isKeyword(r4, r30.parser.compilerEnv.getLanguageVersion(), r30.parser.inUseStrictDirective()) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0144, code lost:
        r4 = convertLastCharToHex(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0149, code lost:
        r7 = stringToKeyword(r4, r30.parser.compilerEnv.getLanguageVersion(), r30.parser.inUseStrictDirective());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x015b, code lost:
        if (r7 == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015f, code lost:
        if (r7 == 167) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0163, code lost:
        if (r7 != 78) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016f, code lost:
        if (r30.parser.compilerEnv.getLanguageVersion() >= 170) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
        if (r7 != 167) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0173, code lost:
        r7 = "let";
     */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:270:0x038f -> B:271:0x0390). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:275:0x03a3 -> B:268:0x0389). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getToken() {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.getToken():int");
    }

    public int getTokenBeg() {
        return this.tokenBeg;
    }

    public int getTokenColumn() {
        return (this.tokenBeg - this.tokenStartLastLineEnd) + 1;
    }

    public int getTokenEnd() {
        return this.tokenEnd;
    }

    public int getTokenLength() {
        return this.tokenEnd - this.tokenBeg;
    }

    public int getTokenStartLineno() {
        return this.tokenStartLineno;
    }

    public final boolean isNumericBinary() {
        return this.isBinary;
    }

    public final boolean isNumericHex() {
        return this.isHex;
    }

    public final boolean isNumericOctal() {
        return this.isOctal;
    }

    public final boolean isNumericOldOctal() {
        return this.isOldOctal;
    }

    public boolean isXMLAttribute() {
        return this.xmlIsAttribute;
    }

    public String readAndClearRegExpFlags() {
        String str = this.regExpFlags;
        this.regExpFlags = null;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        ungetChar(r2);
        r8.tokenEnd = r8.cursor - 1;
        r8.string = new java.lang.String(r8.stringBuffer, 0, r8.stringBufferTop);
        r8.parser.reportError("msg.unterminated.re.lit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00eb, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void readRegExp(int r9) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.TokenStream.readRegExp(int):void");
    }

    public int readTemplateLiteral(boolean z) {
        this.rawString.setLength(0);
        this.stringBufferTop = 0;
        boolean z2 = false;
        while (true) {
            int templateLiteralChar = getTemplateLiteralChar();
            String str = null;
            if (templateLiteralChar != -1) {
                if (templateLiteralChar != 36) {
                    if (templateLiteralChar != 92) {
                        if (templateLiteralChar != 96) {
                            addToString(templateLiteralChar);
                        } else {
                            StringBuilder sb = this.rawString;
                            sb.setLength(sb.length() - 1);
                            if (!z2) {
                                str = getStringFromBuffer();
                            }
                            this.string = str;
                            int i = this.sourceCursor;
                            this.cursor = i;
                            this.tokenEnd = i;
                            return 180;
                        }
                    } else {
                        int templateLiteralChar2 = getTemplateLiteralChar();
                        if (templateLiteralChar2 == 10) {
                            continue;
                        } else {
                            if (templateLiteralChar2 != 98) {
                                if (templateLiteralChar2 != 102) {
                                    if (templateLiteralChar2 != 110) {
                                        if (templateLiteralChar2 != 114) {
                                            if (templateLiteralChar2 != 120) {
                                                if (templateLiteralChar2 != 8232 && templateLiteralChar2 != 8233) {
                                                    switch (templateLiteralChar2) {
                                                        case Token.THIS /* 48 */:
                                                            int peekTemplateLiteralChar = peekTemplateLiteralChar();
                                                            if (peekTemplateLiteralChar >= 48 && peekTemplateLiteralChar <= 57) {
                                                                if (!z) {
                                                                    this.parser.reportError("msg.syntax");
                                                                    return -1;
                                                                }
                                                                z2 = true;
                                                                break;
                                                            } else {
                                                                templateLiteralChar2 = 0;
                                                                break;
                                                            }
                                                            break;
                                                        case Token.FALSE /* 49 */:
                                                        case Token.TRUE /* 50 */:
                                                        case Token.SHEQ /* 51 */:
                                                        case Token.SHNE /* 52 */:
                                                        case Token.REGEXP /* 53 */:
                                                        case Token.BINDNAME /* 54 */:
                                                        case Token.THROW /* 55 */:
                                                        case Token.RETHROW /* 56 */:
                                                        case Token.IN /* 57 */:
                                                            if (!z) {
                                                                this.parser.reportError("msg.syntax");
                                                                return -1;
                                                            }
                                                            z2 = true;
                                                            break;
                                                        default:
                                                            switch (templateLiteralChar2) {
                                                                case Token.COLON /* 116 */:
                                                                    templateLiteralChar2 = 9;
                                                                    break;
                                                                case Token.OR /* 117 */:
                                                                    if (matchTemplateLiteralChar(Token.EXPORT)) {
                                                                        templateLiteralChar2 = 0;
                                                                        while (true) {
                                                                            if (peekTemplateLiteralChar() == 96) {
                                                                                templateLiteralChar2 = -1;
                                                                            } else {
                                                                                int templateLiteralChar3 = getTemplateLiteralChar();
                                                                                if (templateLiteralChar3 == -1) {
                                                                                    this.parser.reportError("msg.syntax");
                                                                                    return -1;
                                                                                } else if (templateLiteralChar3 != 125) {
                                                                                    templateLiteralChar2 = Kit.xDigitToInt(templateLiteralChar3, templateLiteralChar2);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (templateLiteralChar2 >= 0 && templateLiteralChar2 <= 1114111) {
                                                                            if (templateLiteralChar2 <= 65535) {
                                                                                break;
                                                                            } else {
                                                                                addToString(Character.highSurrogate(templateLiteralChar2));
                                                                                addToString(Character.lowSurrogate(templateLiteralChar2));
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            if (!z) {
                                                                                this.parser.reportError("msg.syntax");
                                                                                return -1;
                                                                            }
                                                                            z2 = true;
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        int i2 = 0;
                                                                        int i3 = 0;
                                                                        while (true) {
                                                                            if (i2 < 4) {
                                                                                if (peekTemplateLiteralChar() == 96) {
                                                                                    templateLiteralChar2 = -1;
                                                                                } else {
                                                                                    i3 = Kit.xDigitToInt(getTemplateLiteralChar(), i3);
                                                                                    i2++;
                                                                                }
                                                                            } else {
                                                                                templateLiteralChar2 = i3;
                                                                            }
                                                                        }
                                                                        if (templateLiteralChar2 >= 0) {
                                                                            break;
                                                                        } else {
                                                                            if (!z) {
                                                                                this.parser.reportError("msg.syntax");
                                                                                return -1;
                                                                            }
                                                                            z2 = true;
                                                                        }
                                                                    }
                                                                    break;
                                                                case Token.AND /* 118 */:
                                                                    templateLiteralChar2 = 11;
                                                                    break;
                                                            }
                                                    }
                                                }
                                            } else {
                                                int i4 = 0;
                                                int i5 = 0;
                                                while (true) {
                                                    if (i4 < 2) {
                                                        if (peekTemplateLiteralChar() == 96) {
                                                            templateLiteralChar2 = -1;
                                                        } else {
                                                            i5 = Kit.xDigitToInt(getTemplateLiteralChar(), i5);
                                                            i4++;
                                                        }
                                                    } else {
                                                        templateLiteralChar2 = i5;
                                                    }
                                                }
                                                if (templateLiteralChar2 < 0) {
                                                    if (!z) {
                                                        this.parser.reportError("msg.syntax");
                                                        return -1;
                                                    }
                                                    z2 = true;
                                                }
                                            }
                                        } else {
                                            templateLiteralChar2 = 13;
                                        }
                                    } else {
                                        templateLiteralChar2 = 10;
                                    }
                                } else {
                                    templateLiteralChar2 = 12;
                                }
                            } else {
                                templateLiteralChar2 = 8;
                            }
                            addToString(templateLiteralChar2);
                        }
                    }
                } else if (matchTemplateLiteralChar(Token.EXPORT)) {
                    StringBuilder sb2 = this.rawString;
                    sb2.setLength(sb2.length() - 2);
                    if (!z2) {
                        str = getStringFromBuffer();
                    }
                    this.string = str;
                    this.tokenEnd = this.cursor - 1;
                    return Token.TEMPLATE_LITERAL_SUBST;
                } else {
                    addToString(templateLiteralChar);
                }
            } else {
                if (!z2) {
                    str = getStringFromBuffer();
                }
                this.string = str;
                this.tokenEnd = this.cursor - 1;
                this.parser.reportError("msg.unexpected.eof");
                return -1;
            }
        }
    }

    public String tokenToString(int i) {
        return "";
    }

    private int getCharIgnoreLineEnd(boolean z) {
        return getChar(z, true);
    }

    private void markCommentStart() {
        markCommentStart("");
    }

    private static boolean isDigit(int i) {
        return 48 <= i && i <= 57;
    }

    @Override // org.mozilla.javascript.Parser.CurrentPositionReporter
    public String getLine() {
        int i;
        int i2 = this.sourceCursor;
        int i3 = this.lineEndChar;
        if (i3 >= 0) {
            i = i2 - 1;
            if (i3 == 10 && charAt(i2 - 2) == 13) {
                i = i2 - 2;
            }
        } else {
            int i4 = i2 - this.lineStart;
            while (true) {
                int charAt = charAt(this.lineStart + i4);
                if (charAt == -1 || ScriptRuntime.isJSLineTerminator(charAt)) {
                    break;
                }
                i4++;
            }
            i = this.lineStart + i4;
        }
        return substring(this.lineStart, i);
    }

    private int getChar(boolean z) {
        return getChar(z, false);
    }

    private int getChar() {
        return getChar(true, false);
    }
}
