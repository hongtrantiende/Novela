package defpackage;

import android.app.UiModeManager;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.exoplayer.scheduler.PlatformScheduler$PlatformSchedulerService;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import j$.util.DesugarTimeZone;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a2d  reason: default package */
/* loaded from: classes.dex */
public abstract class a2d {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static HashMap g;
    public static final String[] h;
    public static final String[] i;
    public static final int[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        a = str + ", " + str3 + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        h = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        i = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        j = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        k = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, Token.ASSIGN_MOD, Token.INC, Token.ELSE, Token.DOT, Token.ASSIGN_ADD, Token.ASSIGN_URSH, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, Token.LABEL, Token.TYPEOFNAME, Token.COLONCOLON, Token.SETPROP_OP, 140, Token.VOID, 130, Token.BREAK, Token.CONST, Token.COMMENT, Token.SET, Token.XMLATTR, 180, Token.YIELD_STAR, Token.QUESTION_DOT, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, Token.TAGGED_TEMPLATE_LITERAL, Token.GENEXPR, 185, 190, Token.ARRAYCOMP, Token.LETEXPR, Token.GET, Token.XMLEND, Token.BLOCK, Token.WITH, Token.DEFAULT, Token.CONTINUE, Token.EXPR_VOID, Token.EXPR_RESULT, Token.DOTDOT, Token.SETELEM_OP, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, Token.ASSIGN_DIV, Token.ASSIGN_LOGICAL_AND, 97, 102, Token.HOOK, Token.COLON, Token.IF, Token.FUNCTION, Token.CATCH, Token.COMPUTED_PROPERTY, Token.VAR, Token.CASE, Token.JSR, Token.LOOP, Token.LOCAL_BLOCK, Token.SET_REF_OP, Token.METHOD, Token.TEMPLATE_LITERAL_SUBST, 191, Token.DOTDOTDOT, Token.WITHEXPR, 170, Token.TO_OBJECT, Token.TO_DOUBLE, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, Context.VERSION_ES6, 221, 218, 211, 212, Token.ASSIGN_LSH, 110, Token.ASSIGN_BITAND, 96, Token.OR, 114, Token.EXPORT, Token.IMPORT, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Token.AND, Token.ASSIGN_EXP, 120, Token.SWITCH, Token.ASSIGN_RSH, Token.ASSIGN_SUB, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, Token.DEBUGGER, Token.SETCONST, 160, Token.LET, Token.ARROW, Token.TEMPLATE_CHARS, 188, Token.LAST_TOKEN, 150, Token.TARGET, Token.USE_STACK, Token.XML, Token.FINALLY, Token.EMPTY, Token.FOR, Token.DO, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, Context.VERSION_ECMASCRIPT, 253, 244, 243};
    }

    public static long A(float f2, long j2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 * f2);
    }

    public static long B(long j2) {
        if (j2 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + j2;
    }

    public static int C(int i2, ByteOrder byteOrder) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    if (i2 != 32) {
                        return 0;
                    }
                    if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                        return 22;
                    }
                    return 1610612736;
                } else if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                    return 21;
                } else {
                    return 1342177280;
                }
            } else if (byteOrder.equals(ByteOrder.LITTLE_ENDIAN)) {
                return 2;
            } else {
                return 268435456;
            }
        }
        return 3;
    }

    public static long D(float f2, long j2) {
        if (f2 == 1.0f) {
            return j2;
        }
        return Math.round(j2 / f2);
    }

    public static String E(StringBuilder sb, Formatter formatter, long j2) {
        String str;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        if (j2 < 0) {
            str = "-";
        } else {
            str = "";
        }
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            st0.i("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String G(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return NetworkResponseData.UNKNOWN_CONTENT_TYPE;
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i2 >= 10000) {
                    return hl5.l("custom (", ")", i2);
                }
                return "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(defpackage.cz8 r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            i04 r5 = (defpackage.i04) r5
            int r1 = r5.r()
            r2 = 1
            if (r1 != r2) goto L19
            r3 = 2
            boolean r3 = r5.v(r3)
            if (r3 == 0) goto L19
            r5.D()
        L17:
            r0 = r2
            goto L2f
        L19:
            r3 = 4
            if (r1 != r3) goto L2f
            boolean r1 = r5.v(r3)
            if (r1 == 0) goto L2f
            int r1 = r5.i()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.G(r3, r1, r0)
            goto L17
        L2f:
            boolean r1 = r5.v(r2)
            if (r1 == 0) goto L39
            r5.M(r2)
            return r2
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.H(cz8):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int I(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.I(android.net.Uri, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean J(defpackage.km8 r3, defpackage.km8 r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            byte[] r0 = r4.a
            int r0 = r0.length
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 * 2
            r4.c(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = r1
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 == 0) goto L46
            r4.L(r3)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            r5.reset()
            r3 = 1
            return r3
        L44:
            r3 = move-exception
            goto L63
        L46:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 != 0) goto L5f
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r0 == 0) goto L53
            goto L5f
        L53:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r2 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            if (r3 != r2) goto L2d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            int r0 = r0 * 2
            r4.c(r0)     // Catch: java.lang.Throwable -> L44 java.util.zip.DataFormatException -> L67
            goto L2d
        L5f:
            r5.reset()
            return r1
        L63:
            r5.reset()
            throw r3
        L67:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.J(km8, km8, java.util.zip.Inflater):boolean");
    }

    public static void K(int i2) {
        Integer.toString(i2, 36);
    }

    public static boolean L(int i2) {
        if (i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4 && i2 != 1879048192) {
            return false;
        }
        return true;
    }

    public static boolean M(int i2) {
        if (i2 != 3 && i2 != 2 && i2 != 268435456 && i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4 && i2 != 1879048192) {
            return false;
        }
        return true;
    }

    public static boolean N(android.content.Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && context.getApplicationInfo().targetSdkVersion >= 29) {
            if (i2 == 30) {
                String str = Build.MODEL;
                if (kve.c(str, "moto g(20)") || kve.c(str, "rmx3231")) {
                    return true;
                }
            }
            if (i2 != 34 || !kve.c(Build.MODEL, "sm-x200")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean O(int i2) {
        if (i2 != 10 && i2 != 13) {
            return false;
        }
        return true;
    }

    public static boolean P(android.content.Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static long Q(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 * 1000;
        }
        return j2;
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String B = kve.B(str);
        int i2 = 0;
        String str2 = B.split("-", 2)[0];
        if (g == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = h;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap.put(strArr[i3], strArr[i3 + 1]);
            }
            g = hashMap;
        }
        String str4 = (String) g.get(str2);
        if (str4 != null) {
            B = str4.concat(B.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return B;
        }
        while (true) {
            String[] strArr2 = i;
            if (i2 < strArr2.length) {
                if (B.startsWith(strArr2[i2])) {
                    return strArr2[i2 + 1] + B.substring(strArr2[i2].length());
                }
                i2 += 2;
            } else {
                return B;
            }
        }
    }

    public static Object[] S(int i2, Object[] objArr) {
        boolean z;
        if (i2 <= objArr.length) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        return Arrays.copyOf(objArr, i2);
    }

    public static long T(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                int parseInt = Integer.parseInt(matcher.group(12)) * 60;
                String group = matcher.group(13);
                if (group != null) {
                    i2 = Integer.parseInt(group) + parseInt;
                } else {
                    i2 = parseInt;
                }
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            if (i2 != 0) {
                return timeInMillis - (i2 * 60000);
            }
            return timeInMillis;
        }
        throw xm8.a(null, "Invalid date/time format: " + str);
    }

    public static void U(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return;
        }
        if (looper == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void V(ArrayList arrayList, int i2, int i3) {
        if (i2 >= 0 && i3 <= arrayList.size() && i2 <= i3) {
            if (i2 != i3) {
                arrayList.subList(i2, i3).clear();
                return;
            }
            return;
        }
        p1a.g();
    }

    public static long W(int i2, long j2) {
        return Y(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static void X(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = (j2 > 1000000L ? 1 : (j2 == 1000000L ? 0 : -1));
        int i3 = 0;
        if (i2 >= 0 && j2 % 1000000 == 0) {
            long i4 = twe.i(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = twe.i(jArr[i3], i4, roundingMode);
                i3++;
            }
        } else if (i2 < 0 && 1000000 % j2 == 0) {
            long i5 = twe.i(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = twe.u(jArr[i3], i5);
                i3++;
            }
        } else {
            int i6 = 0;
            while (i6 < jArr.length) {
                long j4 = jArr[i6];
                if (j4 != 0) {
                    int i7 = (j2 > j4 ? 1 : (j2 == j4 ? 0 : -1));
                    if (i7 >= 0 && j2 % j4 == 0) {
                        jArr[i6] = twe.i(1000000L, twe.i(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                    } else if (i7 < 0 && j4 % j2 == 0) {
                        jArr[i6] = twe.u(1000000L, twe.i(j4, j2, RoundingMode.UNNECESSARY));
                    } else {
                        j3 = j2;
                        jArr[i6] = Z(j4, 1000000L, j3, roundingMode);
                        i6++;
                        j2 = j3;
                    }
                }
                j3 = j2;
                i6++;
                j2 = j3;
            }
        }
    }

    public static long Y(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return twe.i(j2, twe.i(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i2 < 0 && j3 % j4 == 0) {
            return twe.u(j2, twe.i(j3, j4, RoundingMode.UNNECESSARY));
        }
        int i3 = (j4 > j2 ? 1 : (j4 == j2 ? 0 : -1));
        if (i3 >= 0 && j4 % j2 == 0) {
            return twe.i(j3, twe.i(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i3 < 0 && j2 % j4 == 0) {
            return twe.u(j3, twe.i(j2, j4, RoundingMode.UNNECESSARY));
        }
        return Z(j2, j3, j4, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long Z(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.Z(long, long, long, java.math.RoundingMode):long");
    }

    public static long a(long j2, long j3) {
        boolean z;
        long j4;
        long j5 = j2 + j3;
        boolean z2 = false;
        if ((j3 ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j2 ^ j5) >= 0) {
            z2 = true;
        }
        if (z | z2) {
            j4 = j5;
        } else {
            j4 = ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
        }
        if ((j4 == Long.MIN_VALUE && j5 != Long.MIN_VALUE) || (j4 == Long.MAX_VALUE && j5 != Long.MAX_VALUE)) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    public static boolean a0(cz8 cz8Var, boolean z) {
        if (cz8Var != null) {
            i04 i04Var = (i04) cz8Var;
            if (i04Var.q() && i04Var.r() != 1 && i04Var.r() != 4 && (!z || i04Var.s() == 0 || i04Var.s() == 4)) {
                return false;
            }
        }
        return true;
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        if (z) {
            return binarySearch;
        }
        return i2;
    }

    public static String[] b0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int c(tx6 tx6Var, long j2) {
        int i2 = tx6Var.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (tx6Var.d(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < tx6Var.b && tx6Var.d(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static void c0(PlatformScheduler$PlatformSchedulerService platformScheduler$PlatformSchedulerService, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            platformScheduler$PlatformSchedulerService.startForegroundService(intent);
        } else {
            platformScheduler$PlatformSchedulerService.startService(intent);
        }
    }

    public static int d(List list, Long l2, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(list, l2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static String d0(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            if (z) {
                i4 = binarySearch;
            } else {
                i4 = i3;
            }
        }
        if (z2) {
            return Math.max(0, i4);
        }
        return i4;
    }

    public static long e0(long j2) {
        if (j2 != -9223372036854775807L && j2 != Long.MIN_VALUE) {
            return j2 / 1000;
        }
        return j2;
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        if (z) {
            return Math.max(0, i2);
        }
        return i2;
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static float h(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int i(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long j(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean k(SparseArray sparseArray, int i2) {
        if (sparseArray.indexOfKey(i2) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj, Object[] objArr) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            if (sparseArray2 == null) {
                return true;
            }
            return false;
        } else if (sparseArray2 == null) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                return sparseArray.contentEquals(sparseArray2);
            }
            int size = sparseArray.size();
            if (size != sparseArray2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int n(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i2 = 17;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int keyAt = sparseArray.keyAt(i3);
            i2 = Objects.hashCode(sparseArray.valueAt(i3)) + ((keyAt + (i2 * 31)) * 31);
        }
        return i2;
    }

    public static int o(int i2, byte[] bArr, int i3, int i4) {
        while (i2 < i3) {
            i4 = j[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler p(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String q(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int r(int i2) {
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int s(int i2) {
        if (i2 != 10) {
            if (i2 != 16) {
                if (i2 != 24) {
                    switch (i2) {
                        case 1:
                            return 4;
                        case 2:
                            return 12;
                        case 3:
                            return 28;
                        case 4:
                            return 204;
                        case 5:
                            return 220;
                        case 6:
                            return 252;
                        case 7:
                            return 1276;
                        case 8:
                            return 6396;
                        default:
                            switch (i2) {
                                case 12:
                                    return 743676;
                                case 13:
                                    if (Build.VERSION.SDK_INT < 32) {
                                        return 0;
                                    }
                                    return 30136348;
                                case 14:
                                    if (Build.VERSION.SDK_INT < 32) {
                                        return 0;
                                    }
                                    return 202070268;
                                default:
                                    return 0;
                            }
                    }
                } else if (Build.VERSION.SDK_INT < 32) {
                    return 0;
                } else {
                    return 67108860;
                }
            } else if (Build.VERSION.SDK_INT < 32) {
                return 0;
            } else {
                return 205215996;
            }
        } else if (Build.VERSION.SDK_INT < 32) {
            return 6396;
        } else {
            return 737532;
        }
    }

    public static int t(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 21) {
                        if (i2 != 22) {
                            if (i2 != 268435456) {
                                if (i2 != 1342177280) {
                                    if (i2 != 1610612736) {
                                        if (i2 == 1879048192) {
                                            return 8;
                                        }
                                        p1a.g();
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return 3;
                }
                return 4;
            }
            return 1;
        }
        return 2;
    }

    public static int u(int i2, String str) {
        int i3 = 0;
        for (String str2 : b0(str)) {
            if (i2 == lc7.i(lc7.e(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String v(int i2, String str) {
        String[] b0 = b0(str);
        if (b0.length != 0) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : b0) {
                if (i2 == lc7.i(lc7.e(str2))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.gm1 w(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            if (r9 != 0) goto L3
            goto L49
        L3:
            boolean r10 = defpackage.lc7.l(r9, r10)
            if (r10 != 0) goto La
            goto L49
        La:
            java.lang.String r10 = "dvhe"
            boolean r10 = r9.startsWith(r10)
            r0 = -1
            r1 = 6
            if (r10 != 0) goto L45
            java.lang.String r10 = "dvh1"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L45
            java.lang.String r10 = "dav1"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L25
            goto L45
        L25:
            if (r11 == 0) goto L41
            java.lang.String r9 = "db1p"
            boolean r9 = r11.equals(r9)
            r10 = 2
            if (r9 == 0) goto L34
        L30:
            r4 = r10
            r3 = r1
            r5 = r3
            goto L47
        L34:
            java.lang.String r9 = "db4"
            boolean r9 = r11.startsWith(r9)
            if (r9 == 0) goto L41
            r9 = 7
            r5 = r9
            r4 = r10
            r3 = r1
            goto L47
        L41:
            r3 = r0
            r4 = r3
            r5 = r4
            goto L47
        L45:
            r10 = 1
            goto L30
        L47:
            if (r3 != r0) goto L4b
        L49:
            r9 = 0
            return r9
        L4b:
            gm1 r2 = new gm1
            r6 = 0
            r7 = -1
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a2d.w(java.lang.String, java.lang.String, java.lang.String):gm1");
    }

    public static Point x(android.content.Context context) {
        Display display;
        String F;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && P(context)) {
            if (Build.VERSION.SDK_INT < 28) {
                F = F("sys.display-size");
            } else {
                F = F("vendor.display-size");
            }
            if (!TextUtils.isEmpty(F)) {
                try {
                    String[] split = F.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                st0.h("Util", "Invalid display size: " + F);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int y(int i2) {
        if (i2 != 2 && i2 != 4) {
            if (i2 != 10) {
                if (i2 != 7) {
                    if (i2 != 8) {
                        switch (i2) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                return 6004;
                            default:
                                switch (i2) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }

    public static int z(String str) {
        String[] split;
        int length;
        boolean z;
        int i2 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        if (length >= 3 && "neg".equals(split[length - 2])) {
            z = true;
        } else {
            z = false;
        }
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }
}
