package org.mozilla.javascript;

import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import j$.util.TimeZoneRetargetClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class NativeDate extends IdScriptableObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int ConstructorId_UTC = -1;
    private static final int ConstructorId_now = -3;
    private static final int ConstructorId_parse = -2;
    private static final double HalfTimeDomain = 8.64E15d;
    private static final double HoursPerDay = 24.0d;
    private static final int Id_constructor = 1;
    private static final int Id_getDate = 17;
    private static final int Id_getDay = 19;
    private static final int Id_getFullYear = 13;
    private static final int Id_getHours = 21;
    private static final int Id_getMilliseconds = 27;
    private static final int Id_getMinutes = 23;
    private static final int Id_getMonth = 15;
    private static final int Id_getSeconds = 25;
    private static final int Id_getTime = 11;
    private static final int Id_getTimezoneOffset = 29;
    private static final int Id_getUTCDate = 18;
    private static final int Id_getUTCDay = 20;
    private static final int Id_getUTCFullYear = 14;
    private static final int Id_getUTCHours = 22;
    private static final int Id_getUTCMilliseconds = 28;
    private static final int Id_getUTCMinutes = 24;
    private static final int Id_getUTCMonth = 16;
    private static final int Id_getUTCSeconds = 26;
    private static final int Id_getYear = 12;
    private static final int Id_setDate = 39;
    private static final int Id_setFullYear = 43;
    private static final int Id_setHours = 37;
    private static final int Id_setMilliseconds = 31;
    private static final int Id_setMinutes = 35;
    private static final int Id_setMonth = 41;
    private static final int Id_setSeconds = 33;
    private static final int Id_setTime = 30;
    private static final int Id_setUTCDate = 40;
    private static final int Id_setUTCFullYear = 44;
    private static final int Id_setUTCHours = 38;
    private static final int Id_setUTCMilliseconds = 32;
    private static final int Id_setUTCMinutes = 36;
    private static final int Id_setUTCMonth = 42;
    private static final int Id_setUTCSeconds = 34;
    private static final int Id_setYear = 45;
    private static final int Id_toDateString = 4;
    private static final int Id_toGMTString = 8;
    private static final int Id_toISOString = 46;
    private static final int Id_toJSON = 47;
    private static final int Id_toLocaleDateString = 7;
    private static final int Id_toLocaleString = 5;
    private static final int Id_toLocaleTimeString = 6;
    private static final int Id_toSource = 9;
    private static final int Id_toString = 2;
    private static final int Id_toTimeString = 3;
    private static final int Id_toUTCString = 8;
    private static final int Id_valueOf = 10;
    private static final int MAXARGS = 7;
    private static final int MAX_PROTOTYPE_ID = 48;
    private static final double MinutesPerDay = 1440.0d;
    private static final double MinutesPerHour = 60.0d;
    private static final double SecondsPerDay = 86400.0d;
    private static final double SecondsPerHour = 3600.0d;
    private static final double SecondsPerMinute = 60.0d;
    private static final int SymbolId_toPrimitive = 48;
    private static final String js_NaN_date_str = "Invalid Date";
    private static final DateTimeFormatter localeDateFormatterES6;
    private static final DateTimeFormatter localeDateTimeFormatterES6;
    private static final DateTimeFormatter localeTimeFormatterES6;
    private static final double msPerDay = 8.64E7d;
    private static final double msPerHour = 3600000.0d;
    private static final double msPerMinute = 60000.0d;
    private static final double msPerSecond = 1000.0d;
    private static final long serialVersionUID = -8307438915861678966L;
    private double date;
    private static final Object DATE_TAG = "Date";
    private static final DateTimeFormatter timeZoneFormatter = DateTimeFormatter.ofPattern("zzz");
    private static final DateTimeFormatter localeDateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm:ss a z");
    private static final DateTimeFormatter localeDateFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    private static final DateTimeFormatter localeTimeFormatter = DateTimeFormatter.ofPattern("h:mm:ss a z");

    static {
        FormatStyle formatStyle = FormatStyle.SHORT;
        localeDateTimeFormatterES6 = DateTimeFormatter.ofLocalizedDateTime(formatStyle);
        localeDateFormatterES6 = DateTimeFormatter.ofLocalizedDate(formatStyle);
        localeTimeFormatterES6 = DateTimeFormatter.ofLocalizedTime(formatStyle);
    }

    private NativeDate() {
    }

    private static int DateFromTime(double d) {
        int i;
        int YearFromTime = YearFromTime(d);
        int Day = (int) (Day(d) - DayFromYear(YearFromTime));
        int i2 = Day - 59;
        if (i2 < 0) {
            if (i2 < -28) {
                return Day + 1;
            }
            return Day - 30;
        }
        if (IsLeapYear(YearFromTime)) {
            if (i2 == 0) {
                return 29;
            }
            i2 = Day - 60;
        }
        int i3 = 30;
        int i4 = 31;
        switch (i2 / 30) {
            case 0:
                return i2 + 1;
            case 1:
                i3 = 31;
                break;
            case 2:
                i4 = 61;
                break;
            case 3:
                i = 92;
                i3 = 31;
                i4 = i;
                break;
            case 4:
                i4 = Token.FUNCTION;
                break;
            case 5:
                i = Token.SETPROP_OP;
                i3 = 31;
                i4 = i;
                break;
            case 6:
                i = Token.DOTDOTDOT;
                i3 = 31;
                i4 = i;
                break;
            case 7:
                i4 = 214;
                break;
            case 8:
                i = 245;
                i3 = 31;
                i4 = i;
                break;
            case 9:
                i4 = 275;
                break;
            case 10:
                return i2 - 274;
            default:
                throw Kit.codeBug();
        }
        int i5 = i2 - i4;
        if (i5 < 0) {
            i5 += i3;
        }
        return i5 + 1;
    }

    private static double Day(double d) {
        return Math.floor(d / msPerDay);
    }

    private static double DayFromMonth(int i, int i2) {
        int i3;
        int i4;
        int i5 = i * 30;
        if (i >= 7) {
            i4 = i / 2;
        } else if (i >= 2) {
            i4 = (i - 1) / 2;
        } else {
            i3 = i5 + i;
            if (i >= 2 && IsLeapYear(i2)) {
                i3++;
            }
            return i3;
        }
        i3 = (i4 - 1) + i5;
        if (i >= 2) {
            i3++;
        }
        return i3;
    }

    private static double DayFromYear(double d) {
        double floor = Math.floor((d - 1969.0d) / 4.0d);
        return Math.floor((d - 1601.0d) / 400.0d) + ((floor + ((d - 1970.0d) * 365.0d)) - Math.floor((d - 1901.0d) / 100.0d));
    }

    private static double DaylightSavingTA(Context context, double d) {
        if (d < 0.0d) {
            d = MakeDate(MakeDay(EquivalentYear(YearFromTime(d)), MonthFromTime(d), DateFromTime(d)), TimeWithinDay(d));
        }
        if (!context.getTimeZone().inDaylightTime(new Date((long) d))) {
            return 0.0d;
        }
        return msPerHour;
    }

    private static int DaysInMonth(int i, int i2) {
        if (i2 == 2) {
            if (IsLeapYear(i)) {
                return 29;
            }
            return 28;
        } else if (i2 >= 8) {
            return 31 - (i2 & 1);
        } else {
            return (i2 & 1) + 30;
        }
    }

    private static double DaysInYear(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            if (IsLeapYear((int) d)) {
                return 366.0d;
            }
            return 365.0d;
        }
        return Double.NaN;
    }

    private static int EquivalentYear(int i) {
        int DayFromYear = (((int) DayFromYear(i)) + 4) % 7;
        if (DayFromYear < 0) {
            DayFromYear += 7;
        }
        if (IsLeapYear(i)) {
            switch (DayFromYear) {
                case 0:
                    return 1984;
                case 1:
                    return 1996;
                case 2:
                    return 1980;
                case 3:
                    return 1992;
                case 4:
                    return 1976;
                case 5:
                    return 1988;
                case 6:
                    return 1972;
            }
        }
        switch (DayFromYear) {
            case 0:
                return 1978;
            case 1:
                return 1973;
            case 2:
                return 1985;
            case 3:
                return 1986;
            case 4:
                return 1981;
            case 5:
                return 1971;
            case 6:
                return 1977;
        }
        throw Kit.codeBug();
    }

    private static int HourFromTime(double d) {
        double floor = Math.floor(d / msPerHour) % HoursPerDay;
        if (floor < 0.0d) {
            floor += HoursPerDay;
        }
        return (int) floor;
    }

    private static boolean IsLeapYear(int i) {
        if (i % 4 == 0) {
            if (i % 100 != 0 || i % 400 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static double LocalTime(Context context, double d) {
        return context.getTimeZone().getRawOffset() + d + DaylightSavingTA(context, d);
    }

    private static double MakeDate(double d, double d2) {
        return (d * msPerDay) + d2;
    }

    private static double MakeDay(double d, double d2, double d3) {
        double floor = Math.floor(d2 / 12.0d) + d;
        double d4 = d2 % 12.0d;
        if (d4 < 0.0d) {
            d4 += 12.0d;
        }
        return ((Math.floor(TimeFromYear(floor) / msPerDay) + DayFromMonth((int) d4, (int) floor)) + d3) - 1.0d;
    }

    private static double MakeTime(double d, double d2, double d3, double d4) {
        return (((((d * 60.0d) + d2) * 60.0d) + d3) * msPerSecond) + d4;
    }

    private static int MinFromTime(double d) {
        double floor = Math.floor(d / msPerMinute) % 60.0d;
        if (floor < 0.0d) {
            floor += 60.0d;
        }
        return (int) floor;
    }

    private static int MonthFromTime(double d) {
        int i;
        int YearFromTime = YearFromTime(d);
        int Day = (int) (Day(d) - DayFromYear(YearFromTime));
        int i2 = Day - 59;
        if (i2 < 0) {
            if (i2 >= -28) {
                return 1;
            }
            return 0;
        }
        if (IsLeapYear(YearFromTime)) {
            if (i2 == 0) {
                return 1;
            }
            i2 = Day - 60;
        }
        int i3 = i2 / 30;
        switch (i3) {
            case 0:
                return 2;
            case 1:
                i = 31;
                break;
            case 2:
                i = 61;
                break;
            case 3:
                i = 92;
                break;
            case 4:
                i = Token.FUNCTION;
                break;
            case 5:
                i = Token.SETPROP_OP;
                break;
            case 6:
                i = Token.DOTDOTDOT;
                break;
            case 7:
                i = 214;
                break;
            case 8:
                i = 245;
                break;
            case 9:
                i = 275;
                break;
            case 10:
                return 11;
            default:
                throw Kit.codeBug();
        }
        if (i2 >= i) {
            return i3 + 2;
        }
        return i3 + 1;
    }

    private static int SecFromTime(double d) {
        double floor = Math.floor(d / msPerSecond) % 60.0d;
        if (floor < 0.0d) {
            floor += 60.0d;
        }
        return (int) floor;
    }

    private static double TimeClip(double d) {
        if (!Double.isNaN(d) && d != Double.POSITIVE_INFINITY && d != Double.NEGATIVE_INFINITY && Math.abs(d) <= HalfTimeDomain) {
            if (d > 0.0d) {
                return Math.floor(d + 0.0d);
            }
            return Math.ceil(d + 0.0d);
        }
        return Double.NaN;
    }

    private static double TimeFromYear(double d) {
        return DayFromYear(d) * msPerDay;
    }

    private static double TimeWithinDay(double d) {
        double d2 = d % msPerDay;
        if (d2 < 0.0d) {
            return d2 + msPerDay;
        }
        return d2;
    }

    private static int WeekDay(double d) {
        double Day = (Day(d) + 4.0d) % 7.0d;
        if (Day < 0.0d) {
            Day += 7.0d;
        }
        return (int) Day;
    }

    private static int YearFromTime(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            double floor = Math.floor(d / 3.1556952E10d) + 1970.0d;
            double TimeFromYear = TimeFromYear(floor);
            if (TimeFromYear > d) {
                floor -= 1.0d;
            } else if ((DaysInYear(floor) * msPerDay) + TimeFromYear <= d) {
                floor += 1.0d;
            }
            return (int) floor;
        }
        return 0;
    }

    private static void append0PaddedUint(StringBuilder sb, int i, int i2) {
        int i3;
        if (i < 0) {
            Kit.codeBug();
        }
        int i4 = i2 - 1;
        if (i >= 10) {
            i3 = 1000000000;
            if (i < 1000000000) {
                i3 = 1;
                while (true) {
                    int i5 = i3 * 10;
                    if (i < i5) {
                        break;
                    }
                    i4--;
                    i3 = i5;
                }
            } else {
                i4 = i2 - 10;
            }
        } else {
            i3 = 1;
        }
        while (i4 > 0) {
            sb.append('0');
            i4--;
        }
        while (i3 != 1) {
            sb.append((char) ((i / i3) + 48));
            i %= i3;
            i3 /= 10;
        }
        sb.append((char) (i + 48));
    }

    private static void appendMonthName(StringBuilder sb, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 != 3; i3++) {
            sb.append("JanFebMarAprMayJunJulAugSepOctNovDec".charAt(i2 + i3));
        }
    }

    private static void appendWeekDayName(StringBuilder sb, int i) {
        int i2 = i * 3;
        for (int i3 = 0; i3 != 3; i3++) {
            sb.append("SunMonTueWedThuFriSat".charAt(i2 + i3));
        }
    }

    private static String date_format(Context context, double d, int i) {
        StringBuilder sb = new StringBuilder(60);
        double LocalTime = LocalTime(context, d);
        if (i != 3) {
            appendWeekDayName(sb, WeekDay(LocalTime));
            sb.append(' ');
            appendMonthName(sb, MonthFromTime(LocalTime));
            sb.append(' ');
            append0PaddedUint(sb, DateFromTime(LocalTime), 2);
            sb.append(' ');
            int YearFromTime = YearFromTime(LocalTime);
            if (YearFromTime < 0) {
                sb.append('-');
                YearFromTime = -YearFromTime;
            }
            append0PaddedUint(sb, YearFromTime, 4);
            if (i != 4) {
                sb.append(' ');
            }
        }
        if (i != 4) {
            append0PaddedUint(sb, HourFromTime(LocalTime), 2);
            sb.append(':');
            append0PaddedUint(sb, MinFromTime(LocalTime), 2);
            sb.append(':');
            append0PaddedUint(sb, SecFromTime(LocalTime), 2);
            int floor = (int) Math.floor((context.getTimeZone().getRawOffset() + DaylightSavingTA(context, d)) / msPerMinute);
            int i2 = (floor % 60) + ((floor / 60) * 100);
            if (i2 > 0) {
                sb.append(" GMT+");
            } else {
                sb.append(" GMT-");
                i2 = -i2;
            }
            append0PaddedUint(sb, i2, 4);
            if (d < 0.0d) {
                d = MakeDate(MakeDay(EquivalentYear(YearFromTime(LocalTime)), MonthFromTime(d), DateFromTime(d)), TimeWithinDay(d));
            }
            sb.append(" (");
            sb.append(timeZoneFormatter.format(Instant.ofEpochMilli((long) d).atZone(TimeZoneRetargetClass.toZoneId(context.getTimeZone()))));
            sb.append(')');
        }
        return sb.toString();
    }

    private static double date_msecFromArgs(Object[] objArr) {
        double[] dArr = new double[7];
        for (int i = 0; i < 7; i++) {
            if (i < objArr.length) {
                double number = ScriptRuntime.toNumber(objArr[i]);
                if (!Double.isNaN(number) && !Double.isInfinite(number)) {
                    dArr[i] = ScriptRuntime.toInteger(objArr[i]);
                } else {
                    return Double.NaN;
                }
            } else if (i == 2) {
                dArr[i] = 1.0d;
            } else {
                dArr[i] = 0.0d;
            }
        }
        double d = dArr[0];
        if (d >= 0.0d && d <= 99.0d) {
            dArr[0] = d + 1900.0d;
        }
        return date_msecFromDate(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5], dArr[6]);
    }

    private static double date_msecFromDate(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return MakeDate(MakeDay(d, d2, d3), MakeTime(d4, d5, d6, d7));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double date_parseString(org.mozilla.javascript.Context r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.date_parseString(org.mozilla.javascript.Context, java.lang.String):double");
    }

    public static void init(Scriptable scriptable, boolean z) {
        NativeDate nativeDate = new NativeDate();
        nativeDate.date = Double.NaN;
        nativeDate.exportAsJSClass(48, scriptable, z);
    }

    private static double internalUTC(Context context, double d) {
        double rawOffset = d - context.getTimeZone().getRawOffset();
        return rawOffset - DaylightSavingTA(context, rawOffset);
    }

    private static Object jsConstructor(Context context, Object[] objArr) {
        double number;
        NativeDate nativeDate = new NativeDate();
        if (objArr.length == 0) {
            nativeDate.date = now();
            return nativeDate;
        } else if (objArr.length == 1) {
            Object obj = objArr[0];
            if (obj instanceof NativeDate) {
                nativeDate.date = ((NativeDate) obj).date;
                return nativeDate;
            }
            Object primitive = ScriptRuntime.toPrimitive(obj);
            if (primitive instanceof CharSequence) {
                number = date_parseString(context, primitive.toString());
            } else {
                number = ScriptRuntime.toNumber(primitive);
            }
            nativeDate.date = TimeClip(number);
            return nativeDate;
        } else {
            double date_msecFromArgs = date_msecFromArgs(objArr);
            if (!Double.isNaN(date_msecFromArgs) && !Double.isInfinite(date_msecFromArgs)) {
                date_msecFromArgs = TimeClip(internalUTC(context, date_msecFromArgs));
            }
            nativeDate.date = date_msecFromArgs;
            return nativeDate;
        }
    }

    private static double jsStaticFunction_UTC(Object[] objArr) {
        if (objArr.length == 0) {
            return Double.NaN;
        }
        return TimeClip(date_msecFromArgs(objArr));
    }

    private static String js_toISOString(double d) {
        StringBuilder sb = new StringBuilder(27);
        int YearFromTime = YearFromTime(d);
        if (YearFromTime < 0) {
            sb.append('-');
            append0PaddedUint(sb, -YearFromTime, 6);
        } else if (YearFromTime > 9999) {
            sb.append('+');
            append0PaddedUint(sb, YearFromTime, 6);
        } else {
            append0PaddedUint(sb, YearFromTime, 4);
        }
        sb.append('-');
        append0PaddedUint(sb, MonthFromTime(d) + 1, 2);
        sb.append('-');
        append0PaddedUint(sb, DateFromTime(d), 2);
        sb.append('T');
        append0PaddedUint(sb, HourFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, MinFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, SecFromTime(d), 2);
        sb.append('.');
        append0PaddedUint(sb, msFromTime(d), 3);
        sb.append('Z');
        return sb.toString();
    }

    private static String js_toUTCString(double d) {
        StringBuilder sb = new StringBuilder(60);
        appendWeekDayName(sb, WeekDay(d));
        sb.append(", ");
        append0PaddedUint(sb, DateFromTime(d), 2);
        sb.append(' ');
        appendMonthName(sb, MonthFromTime(d));
        sb.append(' ');
        int YearFromTime = YearFromTime(d);
        if (YearFromTime < 0) {
            sb.append('-');
            YearFromTime = -YearFromTime;
        }
        append0PaddedUint(sb, YearFromTime, 4);
        sb.append(' ');
        append0PaddedUint(sb, HourFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, MinFromTime(d), 2);
        sb.append(':');
        append0PaddedUint(sb, SecFromTime(d), 2);
        sb.append(" GMT");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double makeDate(org.mozilla.javascript.Context r19, double r20, java.lang.Object[] r22, int r23) {
        /*
            r0 = r22
            int r1 = r0.length
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r1 != 0) goto L8
            return r2
        L8:
            r1 = 2
            r4 = 3
            r5 = 0
            r6 = 1
            switch(r23) {
                case 39: goto L20;
                case 40: goto L1e;
                case 41: goto L1b;
                case 42: goto L19;
                case 43: goto L16;
                case 44: goto L14;
                default: goto Lf;
            }
        Lf:
            java.lang.RuntimeException r0 = org.mozilla.javascript.Kit.codeBug()
            throw r0
        L14:
            r7 = r5
            goto L17
        L16:
            r7 = r6
        L17:
            r8 = r4
            goto L22
        L19:
            r7 = r5
            goto L1c
        L1b:
            r7 = r6
        L1c:
            r8 = r1
            goto L22
        L1e:
            r7 = r5
            goto L21
        L20:
            r7 = r6
        L21:
            r8 = r6
        L22:
            int r9 = r0.length
            if (r9 >= r8) goto L27
            int r9 = r0.length
            goto L28
        L27:
            r9 = r8
        L28:
            double[] r10 = new double[r4]
            r11 = r5
            r12 = r11
        L2c:
            if (r11 >= r9) goto L4c
            r13 = r0[r11]
            double r13 = org.mozilla.javascript.ScriptRuntime.toNumber(r13)
            boolean r15 = java.lang.Double.isNaN(r13)
            if (r15 != 0) goto L48
            boolean r15 = java.lang.Double.isInfinite(r13)
            if (r15 == 0) goto L41
            goto L48
        L41:
            double r13 = org.mozilla.javascript.ScriptRuntime.toInteger(r13)
            r10[r11] = r13
            goto L49
        L48:
            r12 = r6
        L49:
            int r11 = r11 + 1
            goto L2c
        L4c:
            if (r12 == 0) goto L4f
            return r2
        L4f:
            boolean r0 = java.lang.Double.isNaN(r20)
            if (r0 == 0) goto L5b
            if (r8 >= r4) goto L58
            return r2
        L58:
            r2 = 0
            goto L64
        L5b:
            if (r7 == 0) goto L62
            double r2 = LocalTime(r19, r20)
            goto L64
        L62:
            r2 = r20
        L64:
            if (r8 < r4) goto L6d
            if (r9 <= 0) goto L6d
            r4 = r10[r5]
            r13 = r4
            r5 = r6
            goto L73
        L6d:
            int r0 = YearFromTime(r2)
            double r11 = (double) r0
            r13 = r11
        L73:
            if (r8 < r1) goto L7e
            if (r5 >= r9) goto L7e
            int r0 = r5 + 1
            r4 = r10[r5]
            r15 = r4
            r5 = r0
            goto L84
        L7e:
            int r0 = MonthFromTime(r2)
            double r0 = (double) r0
            r15 = r0
        L84:
            if (r5 >= r9) goto L8b
            r0 = r10[r5]
        L88:
            r17 = r0
            goto L91
        L8b:
            int r0 = DateFromTime(r2)
            double r0 = (double) r0
            goto L88
        L91:
            double r0 = MakeDay(r13, r15, r17)
            double r2 = TimeWithinDay(r2)
            double r0 = MakeDate(r0, r2)
            if (r7 == 0) goto La5
            r2 = r19
            double r0 = internalUTC(r2, r0)
        La5:
            double r0 = TimeClip(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.makeDate(org.mozilla.javascript.Context, double, java.lang.Object[], int):double");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double makeTime(org.mozilla.javascript.Context r22, double r23, java.lang.Object[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.makeTime(org.mozilla.javascript.Context, double, java.lang.Object[], int):double");
    }

    private static int msFromTime(double d) {
        double d2 = d % msPerSecond;
        if (d2 < 0.0d) {
            d2 += msPerSecond;
        }
        return (int) d2;
    }

    private static double now() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r0 = -1;
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e7, code lost:
        if (r2 != '-') goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fc, code lost:
        if (r2 != '-') goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double parseISOString(org.mozilla.javascript.Context r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NativeDate.parseISOString(org.mozilla.javascript.Context, java.lang.String):double");
    }

    private static String toLocale_helper(Context context, double d, int i, Object[] objArr) {
        DateTimeFormatter dateTimeFormatter;
        if (i != 5) {
            if (i != 6) {
                if (i == 7) {
                    if (context.getLanguageVersion() >= 200) {
                        dateTimeFormatter = localeDateFormatterES6;
                    } else {
                        dateTimeFormatter = localeDateFormatter;
                    }
                } else {
                    cp8.i();
                    return null;
                }
            } else if (context.getLanguageVersion() >= 200) {
                dateTimeFormatter = localeTimeFormatterES6;
            } else {
                dateTimeFormatter = localeTimeFormatter;
            }
        } else if (context.getLanguageVersion() >= 200) {
            dateTimeFormatter = localeDateTimeFormatterES6;
        } else {
            dateTimeFormatter = localeDateTimeFormatter;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (objArr.length != 0) {
            Object obj = objArr[0];
            if (obj instanceof NativeArray) {
                Iterator it = ((NativeArray) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(Context.toString(it.next()));
                }
            } else {
                arrayList.add(Context.toString(obj));
            }
        }
        List asList = Arrays.asList(Locale.getAvailableLocales());
        int size = arrayList.size();
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            i2++;
            Locale forLanguageTag = Locale.forLanguageTag((String) obj2);
            if (asList.contains(forLanguageTag)) {
                dateTimeFormatter = dateTimeFormatter.withLocale(forLanguageTag);
                break;
            }
        }
        return dateTimeFormatter.format(Instant.ofEpochMilli((long) d).atZone(TimeZoneRetargetClass.toZoneId(context.getTimeZone()))).replace(" ", " ");
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        String str;
        double d;
        double LocalTime;
        if (!idFunctionObject.hasTag(DATE_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId != -3) {
            if (methodId != -2) {
                if (methodId != -1) {
                    if (methodId != 1) {
                        Class<?> cls = null;
                        if (methodId != 47) {
                            if (methodId != 48) {
                                NativeDate nativeDate = (NativeDate) IdScriptableObject.ensureType(scriptable2, NativeDate.class, idFunctionObject);
                                double d2 = nativeDate.date;
                                switch (methodId) {
                                    case 2:
                                    case 3:
                                    case 4:
                                        if (Double.isNaN(d2)) {
                                            return js_NaN_date_str;
                                        }
                                        return date_format(context, d2, methodId);
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (Double.isNaN(d2)) {
                                            return js_NaN_date_str;
                                        }
                                        return toLocale_helper(context, d2, methodId, objArr);
                                    case 8:
                                        if (Double.isNaN(d2)) {
                                            return js_NaN_date_str;
                                        }
                                        return js_toUTCString(d2);
                                    case 9:
                                        return hl5.n("(new Date(", ScriptRuntime.toString(d2), "))");
                                    case 10:
                                    case 11:
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 12:
                                    case 13:
                                    case 14:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId != 14) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = YearFromTime(d2);
                                            if (methodId == 12 && (!context.hasFeature(1) || (1900.0d <= d2 && d2 < 2000.0d))) {
                                                d2 -= 1900.0d;
                                            }
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 15:
                                    case 16:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 15) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = MonthFromTime(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 17:
                                    case 18:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 17) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = DateFromTime(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 19:
                                    case 20:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 19) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = WeekDay(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 21:
                                    case 22:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 21) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = HourFromTime(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 23:
                                    case 24:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 23) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = MinFromTime(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 25:
                                    case 26:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 25) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = SecFromTime(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 27:
                                    case 28:
                                        if (!Double.isNaN(d2)) {
                                            if (methodId == 27) {
                                                d2 = LocalTime(context, d2);
                                            }
                                            d2 = msFromTime(d2);
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 29:
                                        if (!Double.isNaN(d2)) {
                                            d2 = (d2 - LocalTime(context, d2)) / msPerMinute;
                                        }
                                        return ScriptRuntime.wrapNumber(d2);
                                    case 30:
                                        double TimeClip = TimeClip(ScriptRuntime.toNumber(objArr, 0));
                                        nativeDate.date = TimeClip;
                                        return ScriptRuntime.wrapNumber(TimeClip);
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                        double makeTime = makeTime(context, d2, objArr, methodId);
                                        nativeDate.date = makeTime;
                                        return ScriptRuntime.wrapNumber(makeTime);
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                        double makeDate = makeDate(context, d2, objArr, methodId);
                                        nativeDate.date = makeDate;
                                        return ScriptRuntime.wrapNumber(makeDate);
                                    case 45:
                                        double number = ScriptRuntime.toNumber(objArr, 0);
                                        if (!Double.isNaN(number) && !Double.isInfinite(number)) {
                                            if (Double.isNaN(d2)) {
                                                LocalTime = 0.0d;
                                            } else {
                                                LocalTime = LocalTime(context, d2);
                                            }
                                            if (number >= 0.0d && number <= 99.0d) {
                                                number += 1900.0d;
                                            }
                                            d = TimeClip(internalUTC(context, MakeDate(MakeDay(number, MonthFromTime(LocalTime), DateFromTime(LocalTime)), TimeWithinDay(LocalTime))));
                                        } else {
                                            d = Double.NaN;
                                        }
                                        nativeDate.date = d;
                                        return ScriptRuntime.wrapNumber(d);
                                    case 46:
                                        if (!Double.isNaN(d2)) {
                                            return js_toISOString(d2);
                                        }
                                        throw ScriptRuntime.rangeError(ScriptRuntime.getMessageById("msg.invalid.date", new Object[0]));
                                    default:
                                        vs.m(String.valueOf(methodId));
                                        return null;
                                }
                            }
                            Scriptable object = ScriptRuntime.toObject(context, scriptable, scriptable2);
                            if (objArr.length > 0) {
                                obj = objArr[0];
                            } else {
                                obj = Undefined.instance;
                            }
                            if (obj instanceof CharSequence) {
                                str = obj.toString();
                            } else {
                                str = null;
                            }
                            if (!"string".equals(str) && !"default".equals(str)) {
                                if ("number".equals(str)) {
                                    cls = ScriptRuntime.NumberClass;
                                }
                            } else {
                                cls = ScriptRuntime.StringClass;
                            }
                            if (cls != null) {
                                return ScriptableObject.getDefaultValue(object, cls);
                            }
                            throw ScriptRuntime.typeErrorById("msg.invalid.toprimitive.hint", ScriptRuntime.toString(obj));
                        }
                        Scriptable object2 = ScriptRuntime.toObject(context, scriptable, scriptable2);
                        Object primitive = ScriptRuntime.toPrimitive(object2, ScriptRuntime.NumberClass);
                        if (primitive instanceof Number) {
                            double doubleValue = ((Number) primitive).doubleValue();
                            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                                return null;
                            }
                        }
                        Object property = ScriptableObject.getProperty(object2, "toISOString");
                        if (property != Scriptable.NOT_FOUND) {
                            if (property instanceof Callable) {
                                Object call = ((Callable) property).call(context, scriptable, object2, ScriptRuntime.emptyArgs);
                                if (ScriptRuntime.isPrimitive(call)) {
                                    return call;
                                }
                                throw ScriptRuntime.typeErrorById("msg.toisostring.must.return.primitive", ScriptRuntime.toString(call));
                            }
                            throw ScriptRuntime.typeErrorById("msg.isnt.function.in", "toISOString", ScriptRuntime.toString(object2), ScriptRuntime.toString(property));
                        }
                        throw ScriptRuntime.typeErrorById("msg.function.not.found.in", "toISOString", ScriptRuntime.toString(object2));
                    } else if (scriptable2 != null) {
                        return date_format(context, now(), 2);
                    } else {
                        return jsConstructor(context, objArr);
                    }
                }
                return ScriptRuntime.wrapNumber(jsStaticFunction_UTC(objArr));
            }
            return ScriptRuntime.wrapNumber(date_parseString(context, ScriptRuntime.toString(objArr, 0)));
        }
        return ScriptRuntime.wrapNumber(now());
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        Object obj = DATE_TAG;
        addIdFunctionProperty(idFunctionObject, obj, -3, "now", 0);
        addIdFunctionProperty(idFunctionObject, obj, -2, "parse", 1);
        addIdFunctionProperty(idFunctionObject, obj, -1, "UTC", 7);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2020003546:
                if (str.equals("toLocaleString")) {
                    c = 0;
                    break;
                }
                break;
            case -1919317088:
                if (str.equals("getUTCMilliseconds")) {
                    c = 1;
                    break;
                }
                break;
            case -1781441930:
                if (str.equals("toSource")) {
                    c = 2;
                    break;
                }
                break;
            case -1776922004:
                if (str.equals("toString")) {
                    c = 3;
                    break;
                }
                break;
            case -1672509548:
                if (str.equals("setMilliseconds")) {
                    c = 4;
                    break;
                }
                break;
            case -1588406278:
                if (str.equals("constructor")) {
                    c = 5;
                    break;
                }
                break;
            case -1573876166:
                if (str.equals("toDateString")) {
                    c = 6;
                    break;
                }
                break;
            case -1326181948:
                if (str.equals("toGMTString")) {
                    c = 7;
                    break;
                }
                break;
            case -1312629223:
                if (str.equals("toTimeString")) {
                    c = '\b';
                    break;
                }
                break;
            case -1288010167:
                if (str.equals("getSeconds")) {
                    c = '\t';
                    break;
                }
                break;
            case -1249364890:
                if (str.equals("getDay")) {
                    c = '\n';
                    break;
                }
                break;
            case -1031333299:
                if (str.equals("setUTCHours")) {
                    c = 11;
                    break;
                }
                break;
            case -1026722370:
                if (str.equals("setUTCMonth")) {
                    c = '\f';
                    break;
                }
                break;
            case -999283436:
                if (str.equals("setUTCMilliseconds")) {
                    c = '\r';
                    break;
                }
                break;
            case -974463506:
                if (str.equals("setFullYear")) {
                    c = 14;
                    break;
                }
                break;
            case -973718674:
                if (str.equals("setUTCFullYear")) {
                    c = 15;
                    break;
                }
                break;
            case -942753471:
                if (str.equals("getUTCHours")) {
                    c = 16;
                    break;
                }
                break;
            case -938142542:
                if (str.equals("getUTCMonth")) {
                    c = 17;
                    break;
                }
                break;
            case -885883678:
                if (str.equals("getFullYear")) {
                    c = 18;
                    break;
                }
                break;
            case -869188125:
                if (str.equals("toJSON")) {
                    c = 19;
                    break;
                }
                break;
            case -493762846:
                if (str.equals("getTimezoneOffset")) {
                    c = 20;
                    break;
                }
                break;
            case -256399843:
                if (str.equals("setMinutes")) {
                    c = 21;
                    break;
                }
                break;
            case -75605980:
                if (str.equals("getDate")) {
                    c = 22;
                    break;
                }
                break;
            case -75121853:
                if (str.equals("getTime")) {
                    c = 23;
                    break;
                }
                break;
            case -74977101:
                if (str.equals("getYear")) {
                    c = 24;
                    break;
                }
                break;
            case -30544068:
                if (str.equals("getUTCDate")) {
                    c = 25;
                    break;
                }
                break;
            case 216418961:
                if (str.equals("getUTCMinutes")) {
                    c = 26;
                    break;
                }
                break;
            case 231605032:
                if (str.equals("valueOf")) {
                    c = 27;
                    break;
                }
                break;
            case 546336410:
                if (str.equals("toUTCString")) {
                    c = 28;
                    break;
                }
                break;
            case 648795069:
                if (str.equals("setSeconds")) {
                    c = 29;
                    break;
                }
                break;
            case 798017530:
                if (str.equals("getUTCFullYear")) {
                    c = 30;
                    break;
                }
                break;
            case 830298702:
                if (str.equals("getUTCDay")) {
                    c = 31;
                    break;
                }
                break;
            case 990550173:
                if (str.equals("setUTCMinutes")) {
                    c = ' ';
                    break;
                }
                break;
            case 1078252731:
                if (str.equals("toISOString")) {
                    c = '!';
                    break;
                }
                break;
            case 1121613873:
                if (str.equals("getUTCSeconds")) {
                    c = '\"';
                    break;
                }
                break;
            case 1162969076:
                if (str.equals("toLocaleDateString")) {
                    c = '#';
                    break;
                }
                break;
            case 1394182093:
                if (str.equals("setHours")) {
                    c = '$';
                    break;
                }
                break;
            case 1398793022:
                if (str.equals("setMonth")) {
                    c = '%';
                    break;
                }
                break;
            case 1424216019:
                if (str.equals("toLocaleTimeString")) {
                    c = '&';
                    break;
                }
                break;
            case 1711705224:
                if (str.equals("getMilliseconds")) {
                    c = '\'';
                    break;
                }
                break;
            case 1895745085:
                if (str.equals("setUTCSeconds")) {
                    c = '(';
                    break;
                }
                break;
            case 1906261168:
                if (str.equals("setUTCDate")) {
                    c = ')';
                    break;
                }
                break;
            case 1955294553:
                if (str.equals("getHours")) {
                    c = '*';
                    break;
                }
                break;
            case 1959905482:
                if (str.equals("getMonth")) {
                    c = '+';
                    break;
                }
                break;
            case 1984503600:
                if (str.equals("setDate")) {
                    c = ',';
                    break;
                }
                break;
            case 1984987727:
                if (str.equals("setTime")) {
                    c = '-';
                    break;
                }
                break;
            case 1985132479:
                if (str.equals("setYear")) {
                    c = '.';
                    break;
                }
                break;
            case 2101762217:
                if (str.equals("getMinutes")) {
                    c = '/';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
                return 28;
            case 2:
                return 9;
            case 3:
                return 2;
            case 4:
                return 31;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 8;
            case '\b':
                return 3;
            case '\t':
                return 25;
            case '\n':
                return 19;
            case 11:
                return 38;
            case '\f':
                return 42;
            case '\r':
                return 32;
            case 14:
                return 43;
            case 15:
                return 44;
            case 16:
                return 22;
            case 17:
                return 16;
            case 18:
                return 13;
            case 19:
                return 47;
            case 20:
                return 29;
            case 21:
                return 35;
            case 22:
                return 17;
            case 23:
                return 11;
            case 24:
                return 12;
            case 25:
                return 18;
            case 26:
                return 24;
            case 27:
                return 10;
            case 28:
                return 8;
            case 29:
                return 33;
            case 30:
                return 14;
            case 31:
                return 20;
            case ' ':
                return 36;
            case '!':
                return 46;
            case '\"':
                return 26;
            case '#':
                return 7;
            case '$':
                return 37;
            case '%':
                return 41;
            case '&':
                return 6;
            case '\'':
                return 27;
            case '(':
                return 34;
            case ')':
                return 40;
            case '*':
                return 21;
            case '+':
                return 15;
            case ',':
                return 39;
            case '-':
                return 30;
            case '.':
                return 45;
            case '/':
                return 23;
            default:
                return 0;
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Date";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls == null) {
            cls = ScriptRuntime.StringClass;
        }
        return super.getDefaultValue(cls);
    }

    public double getJSTimeValue() {
        return this.date;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i) {
        String str;
        String str2;
        int i2 = 4;
        int i3 = 0;
        switch (i) {
            case 1:
                i2 = 7;
                str = "constructor";
                i3 = i2;
                str2 = str;
                break;
            case 2:
                str2 = "toString";
                break;
            case 3:
                str2 = "toTimeString";
                break;
            case 4:
                str2 = "toDateString";
                break;
            case 5:
                str2 = "toLocaleString";
                break;
            case 6:
                str2 = "toLocaleTimeString";
                break;
            case 7:
                str2 = "toLocaleDateString";
                break;
            case 8:
                str2 = "toUTCString";
                break;
            case 9:
                str2 = "toSource";
                break;
            case 10:
                str2 = "valueOf";
                break;
            case 11:
                str2 = "getTime";
                break;
            case 12:
                str2 = "getYear";
                break;
            case 13:
                str2 = "getFullYear";
                break;
            case 14:
                str2 = "getUTCFullYear";
                break;
            case 15:
                str2 = "getMonth";
                break;
            case 16:
                str2 = "getUTCMonth";
                break;
            case 17:
                str2 = "getDate";
                break;
            case 18:
                str2 = "getUTCDate";
                break;
            case 19:
                str2 = "getDay";
                break;
            case 20:
                str2 = "getUTCDay";
                break;
            case 21:
                str2 = "getHours";
                break;
            case 22:
                str2 = "getUTCHours";
                break;
            case 23:
                str2 = "getMinutes";
                break;
            case 24:
                str2 = "getUTCMinutes";
                break;
            case 25:
                str2 = "getSeconds";
                break;
            case 26:
                str2 = "getUTCSeconds";
                break;
            case 27:
                str2 = "getMilliseconds";
                break;
            case 28:
                str2 = "getUTCMilliseconds";
                break;
            case 29:
                str2 = "getTimezoneOffset";
                break;
            case 30:
                str2 = "setTime";
                i3 = 1;
                break;
            case 31:
                str2 = "setMilliseconds";
                i3 = 1;
                break;
            case 32:
                str2 = "setUTCMilliseconds";
                i3 = 1;
                break;
            case 33:
                str2 = "setSeconds";
                i3 = 2;
                break;
            case 34:
                str2 = "setUTCSeconds";
                i3 = 2;
                break;
            case 35:
                str2 = "setMinutes";
                i3 = 3;
                break;
            case 36:
                str2 = "setUTCMinutes";
                i3 = 3;
                break;
            case 37:
                str = "setHours";
                i3 = i2;
                str2 = str;
                break;
            case 38:
                str = "setUTCHours";
                i3 = i2;
                str2 = str;
                break;
            case 39:
                str2 = "setDate";
                i3 = 1;
                break;
            case 40:
                str2 = "setUTCDate";
                i3 = 1;
                break;
            case 41:
                str2 = "setMonth";
                i3 = 2;
                break;
            case 42:
                str2 = "setUTCMonth";
                i3 = 2;
                break;
            case 43:
                str2 = "setFullYear";
                i3 = 3;
                break;
            case 44:
                str2 = "setUTCFullYear";
                i3 = 3;
                break;
            case 45:
                str2 = "setYear";
                i3 = 1;
                break;
            case 46:
                str2 = "toISOString";
                break;
            case 47:
                str2 = "toJSON";
                i3 = 1;
                break;
            case Token.THIS /* 48 */:
                initPrototypeMethod(DATE_TAG, i, SymbolKey.TO_PRIMITIVE, "[Symbol.toPrimitive]", 1);
                return;
            default:
                vs.m(String.valueOf(i));
                return;
        }
        initPrototypeMethod(DATE_TAG, i, str2, i3);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(Symbol symbol) {
        return SymbolKey.TO_PRIMITIVE.equals(symbol) ? 48 : 0;
    }
}
