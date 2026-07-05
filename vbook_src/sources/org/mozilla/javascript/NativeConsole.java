package org.mozilla.javascript;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NativeConsole extends IdScriptableObject {
    private static final String DEFAULT_LABEL = "default";
    private static final int Id_assert = 8;
    private static final int Id_count = 9;
    private static final int Id_countReset = 10;
    private static final int Id_debug = 3;
    private static final int Id_error = 7;
    private static final int Id_info = 5;
    private static final int Id_log = 4;
    private static final int Id_time = 11;
    private static final int Id_timeEnd = 12;
    private static final int Id_timeLog = 13;
    private static final int Id_toSource = 1;
    private static final int Id_trace = 2;
    private static final int Id_warn = 6;
    private static final int LAST_METHOD_ID = 13;
    private static final int MAX_ID = 13;
    private static final long serialVersionUID = 5694613212458273057L;
    private final ConsolePrinter printer;
    private static final Object CONSOLE_TAG = "Console";
    private static final Pattern FMT_REG = Pattern.compile("%[sfdioOc%]");
    private final Map<String, Long> timers = new ConcurrentHashMap();
    private final Map<String, AtomicInteger> counters = new ConcurrentHashMap();

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public interface ConsolePrinter extends Serializable {
        void print(Context context, Scriptable scriptable, Level level, Object[] objArr, ScriptStackElement[] scriptStackElementArr);
    }

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes3.dex */
    public enum Level {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    private NativeConsole(ConsolePrinter consolePrinter) {
        this.printer = consolePrinter;
    }

    private void count(Context context, Scriptable scriptable, Object[] objArr) {
        String str;
        if (objArr.length > 0) {
            str = ScriptRuntime.toString(objArr[0]);
        } else {
            str = DEFAULT_LABEL;
        }
        print(context, scriptable, Level.INFO, a82.m(str, ": ", this.counters.computeIfAbsent(str, new f1(3)).incrementAndGet()));
    }

    private void countReset(Context context, Scriptable scriptable, Object[] objArr) {
        String str;
        if (objArr.length > 0) {
            str = ScriptRuntime.toString(objArr[0]);
        } else {
            str = DEFAULT_LABEL;
        }
        if (this.counters.remove(str) == null) {
            print(context, scriptable, Level.WARN, hl5.n("Count for '", str, "' does not exist."));
        }
    }

    public static String format(Context context, Scriptable scriptable, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        Object obj = objArr[0];
        if ((obj instanceof String) || (obj instanceof ConsString)) {
            Matcher matcher = FMT_REG.matcher(obj.toString());
            int i2 = 1;
            while (matcher.find()) {
                String group = matcher.group();
                if (group.equals("%%")) {
                    group = "%";
                } else {
                    if (i2 < objArr.length) {
                        Object obj2 = objArr[i2];
                        char c = 65535;
                        switch (group.hashCode()) {
                            case 1226:
                                if (group.equals("%O")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 1247:
                                if (group.equals("%d")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1249:
                                if (group.equals("%f")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1252:
                                if (group.equals("%i")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 1258:
                                if (group.equals("%o")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1262:
                                if (group.equals("%s")) {
                                    c = 5;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 4:
                                group = formatObj(context, scriptable, obj2);
                                break;
                            case 1:
                            case 3:
                                group = formatInt(obj2);
                                break;
                            case 2:
                                group = formatFloat(obj2);
                                break;
                            case 5:
                                group = formatString(obj2);
                                break;
                            default:
                                group = "";
                                break;
                        }
                    }
                    i2++;
                }
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(group));
            }
            matcher.appendTail(stringBuffer);
            i = i2;
        }
        while (i < objArr.length) {
            if (stringBuffer.length() > 0) {
                stringBuffer.append(' ');
            }
            Object obj3 = objArr[i];
            if (obj3 instanceof String) {
                stringBuffer.append(formatString(obj3));
            } else {
                stringBuffer.append(formatObj(context, scriptable, obj3));
            }
            i++;
        }
        return stringBuffer.toString();
    }

    private static String formatFloat(Object obj) {
        if (!(obj instanceof BigInteger) && !ScriptRuntime.isSymbol(obj)) {
            return ScriptRuntime.numberToString(ScriptRuntime.toNumber(obj), 10);
        }
        return ScriptRuntime.NaNobj.toString();
    }

    private static String formatInt(Object obj) {
        if (obj instanceof BigInteger) {
            return nk2.u(ScriptRuntime.bigIntToString((BigInteger) obj, 10), "n");
        }
        if (ScriptRuntime.isSymbol(obj)) {
            return ScriptRuntime.NaNobj.toString();
        }
        double number = ScriptRuntime.toNumber(obj);
        if (!Double.isInfinite(number) && !Double.isNaN(number)) {
            return String.valueOf((long) number);
        }
        return ScriptRuntime.toString(number);
    }

    private static String formatObj(Context context, Scriptable scriptable, final Object obj) {
        if (obj == null) {
            return "null";
        }
        if (Undefined.isUndefined(obj)) {
            return Undefined.SCRIPTABLE_UNDEFINED.toString();
        }
        if (obj instanceof NativeError) {
            NativeError nativeError = (NativeError) obj;
            return nk2.u(nativeError.toString(), "\n").concat(String.valueOf(nativeError.get("stack")));
        }
        try {
            return ScriptRuntime.toString(NativeJSON.stringify(context, scriptable, obj, new Callable() { // from class: org.mozilla.javascript.NativeConsole.1
                @Override // org.mozilla.javascript.Callable
                public Object call(Context context2, Scriptable scriptable2, Scriptable scriptable3, Object[] objArr) {
                    Scriptable scriptable4 = objArr[1];
                    while (scriptable4 instanceof Delegator) {
                        scriptable4 = ((Delegator) scriptable4).getDelegee();
                    }
                    if (scriptable4 instanceof BaseFunction) {
                        return "function " + ((BaseFunction) scriptable4).getFunctionName() + "() {...}";
                    } else if (scriptable4 instanceof Callable) {
                        return ScriptRuntime.toString(scriptable4);
                    } else {
                        Object obj2 = obj;
                        if (obj2 instanceof NativeError) {
                            return ((NativeError) obj2).toString();
                        }
                        return scriptable4;
                    }
                }
            }, null));
        } catch (EcmaError e) {
            if ("TypeError".equals(e.getName())) {
                return ScriptRuntime.toString(obj);
            }
            throw e;
        }
    }

    private static String formatString(Object obj) {
        if (obj instanceof BigInteger) {
            return nk2.u(ScriptRuntime.toString(obj), "n");
        }
        if (ScriptRuntime.isSymbol(obj)) {
            return obj.toString();
        }
        return ScriptRuntime.toString(obj);
    }

    public static void init(Scriptable scriptable, boolean z, ConsolePrinter consolePrinter) {
        NativeConsole nativeConsole = new NativeConsole(consolePrinter);
        nativeConsole.activatePrototypeMap(13);
        nativeConsole.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        nativeConsole.setParentScope(scriptable);
        if (z) {
            nativeConsole.sealObject();
        }
        ScriptableObject.defineProperty(scriptable, "console", nativeConsole, 2);
    }

    private void jsAssert(Context context, Scriptable scriptable, Object[] objArr) {
        Object[] objArr2;
        if (objArr != null && objArr.length > 0 && ScriptRuntime.toBoolean(objArr[0])) {
            return;
        }
        if (objArr != null && objArr.length >= 2) {
            Object obj = objArr[1];
            if (obj instanceof String) {
                objArr[1] = "Assertion failed: ".concat(String.valueOf(obj));
                int length = objArr.length - 1;
                Object[] objArr3 = new Object[length];
                System.arraycopy(objArr, 1, objArr3, 0, length);
                objArr2 = objArr3;
            } else {
                objArr[0] = "Assertion failed:";
                objArr2 = objArr;
            }
            this.printer.print(context, scriptable, Level.ERROR, objArr2, null);
            return;
        }
        this.printer.print(context, scriptable, Level.ERROR, new String[]{"Assertion failed: console.assert"}, null);
    }

    public static /* synthetic */ AtomicInteger lambda$count$0(String str) {
        return new AtomicInteger(0);
    }

    private double nano2Milli(Long l) {
        return l.longValue() / 1000000.0d;
    }

    private void print(Context context, Scriptable scriptable, Level level, String str) {
        this.printer.print(context, scriptable, level, new String[]{str}, null);
    }

    private void time(Context context, Scriptable scriptable, Object[] objArr) {
        String str;
        if (objArr.length > 0) {
            str = ScriptRuntime.toString(objArr[0]);
        } else {
            str = DEFAULT_LABEL;
        }
        if (this.timers.get(str) != null) {
            print(context, scriptable, Level.WARN, hl5.n("Timer '", str, "' already exists."));
        } else {
            this.timers.put(str, Long.valueOf(System.nanoTime()));
        }
    }

    private void timeEnd(Context context, Scriptable scriptable, Object[] objArr) {
        String str;
        if (objArr.length > 0) {
            str = ScriptRuntime.toString(objArr[0]);
        } else {
            str = DEFAULT_LABEL;
        }
        Long remove = this.timers.remove(str);
        if (remove == null) {
            print(context, scriptable, Level.WARN, hl5.n("Timer '", str, "' does not exist."));
            return;
        }
        Level level = Level.INFO;
        double nano2Milli = nano2Milli(Long.valueOf(System.nanoTime() - remove.longValue()));
        print(context, scriptable, level, str + ": " + nano2Milli + "ms");
    }

    private void timeLog(Context context, Scriptable scriptable, Object[] objArr) {
        String str;
        if (objArr.length > 0) {
            str = ScriptRuntime.toString(objArr[0]);
        } else {
            str = DEFAULT_LABEL;
        }
        Long l = this.timers.get(str);
        if (l == null) {
            print(context, scriptable, Level.WARN, hl5.n("Timer '", str, "' does not exist."));
            return;
        }
        double nano2Milli = nano2Milli(Long.valueOf(System.nanoTime() - l.longValue()));
        StringBuilder sb = new StringBuilder(str + ": " + nano2Milli + "ms");
        if (objArr.length > 1) {
            for (int i = 1; i < objArr.length; i++) {
                sb.append(" ");
                sb.append(ScriptRuntime.toString(objArr[i]));
            }
        }
        print(context, scriptable, Level.INFO, sb.toString());
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(CONSOLE_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        switch (methodId) {
            case 1:
                return "Console";
            case 2:
                this.printer.print(context, scriptable, Level.TRACE, objArr, new EvaluatorException("[object Object]").getScriptStack());
                break;
            case 3:
                this.printer.print(context, scriptable, Level.DEBUG, objArr, null);
                break;
            case 4:
            case 5:
                this.printer.print(context, scriptable, Level.INFO, objArr, null);
                break;
            case 6:
                this.printer.print(context, scriptable, Level.WARN, objArr, null);
                break;
            case 7:
                this.printer.print(context, scriptable, Level.ERROR, objArr, null);
                break;
            case 8:
                jsAssert(context, scriptable, objArr);
                break;
            case 9:
                count(context, scriptable, objArr);
                break;
            case 10:
                countReset(context, scriptable, objArr);
                break;
            case 11:
                time(context, scriptable, objArr);
                break;
            case 12:
                timeEnd(context, scriptable, objArr);
                break;
            case 13:
                timeLog(context, scriptable, objArr);
                break;
            default:
                vs.k(String.valueOf(methodId));
                return null;
        }
        return Undefined.instance;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 0;
                    break;
                }
                break;
            case -1408208058:
                if (str.equals("assert")) {
                    c = 1;
                    break;
                }
                break;
            case -1313952050:
                if (str.equals("timeEnd")) {
                    c = 2;
                    break;
                }
                break;
            case -1313945289:
                if (str.equals("timeLog")) {
                    c = 3;
                    break;
                }
                break;
            case -1047581312:
                if (str.equals("countReset")) {
                    c = 4;
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    c = 5;
                    break;
                }
                break;
            case 3237038:
                if (str.equals("info")) {
                    c = 6;
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    c = 7;
                    break;
                }
                break;
            case 3641990:
                if (str.equals("warn")) {
                    c = '\b';
                    break;
                }
                break;
            case 94851343:
                if (str.equals("count")) {
                    c = '\t';
                    break;
                }
                break;
            case 95458899:
                if (str.equals("debug")) {
                    c = '\n';
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 11;
                    break;
                }
                break;
            case 110620997:
                if (str.equals("trace")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 8;
            case 2:
                return 12;
            case 3:
                return 13;
            case 4:
                return 10;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 11;
            case '\b':
                return 6;
            case '\t':
                return 9;
            case '\n':
                return 3;
            case 11:
                return 7;
            case '\f':
                return 2;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Console";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        if (i <= 13) {
            int i2 = 2;
            switch (i) {
                case 1:
                    i2 = 0;
                    str = "toSource";
                    break;
                case 2:
                    str2 = "trace";
                    str = str2;
                    i2 = 1;
                    break;
                case 3:
                    str2 = "debug";
                    str = str2;
                    i2 = 1;
                    break;
                case 4:
                    str2 = "log";
                    str = str2;
                    i2 = 1;
                    break;
                case 5:
                    str2 = "info";
                    str = str2;
                    i2 = 1;
                    break;
                case 6:
                    str2 = "warn";
                    str = str2;
                    i2 = 1;
                    break;
                case 7:
                    str2 = "error";
                    str = str2;
                    i2 = 1;
                    break;
                case 8:
                    str = "assert";
                    break;
                case 9:
                    str2 = "count";
                    str = str2;
                    i2 = 1;
                    break;
                case 10:
                    str2 = "countReset";
                    str = str2;
                    i2 = 1;
                    break;
                case 11:
                    str2 = "time";
                    str = str2;
                    i2 = 1;
                    break;
                case 12:
                    str2 = "timeEnd";
                    str = str2;
                    i2 = 1;
                    break;
                case 13:
                    str = "timeLog";
                    break;
                default:
                    vs.k(String.valueOf(i));
                    return;
            }
            initPrototypeMethod(CONSOLE_TAG, i, str, i2);
            return;
        }
        vs.k(String.valueOf(i));
    }
}
