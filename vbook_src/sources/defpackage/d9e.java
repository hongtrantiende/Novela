package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d9e  reason: default package */
/* loaded from: classes.dex */
public abstract class d9e {
    public static final ro a;

    static {
        u8e x = v8e.x();
        x.f(-62135596800L);
        x.e(0);
        v8e v8eVar = (v8e) x.b();
        u8e x2 = v8e.x();
        x2.f(253402300799L);
        x2.e(999999999);
        v8e v8eVar2 = (v8e) x2.b();
        u8e x3 = v8e.x();
        x3.f(0L);
        x3.e(0);
        v8e v8eVar3 = (v8e) x3.b();
        a = new ro(4);
        try {
            Class.forName("j$.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }

    public static v8e a(String str) {
        String str2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int indexOf = str.indexOf(84);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 != -1) {
                String substring = str.substring(0, indexOf2);
                int indexOf3 = substring.indexOf(46);
                boolean z5 = true;
                if (indexOf3 != -1) {
                    String substring2 = substring.substring(0, indexOf3);
                    str2 = substring.substring(indexOf3 + 1);
                    substring = substring2;
                } else {
                    str2 = "";
                }
                long time = ((SimpleDateFormat) a.get()).parse(substring).getTime() / 1000;
                if (str2.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (int i2 = 0; i2 < 9; i2++) {
                        i *= 10;
                        if (i2 < str2.length()) {
                            if (str2.charAt(i2) >= '0' && str2.charAt(i2) <= '9') {
                                i = (str2.charAt(i2) - '0') + i;
                            } else {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                        }
                    }
                }
                if (str.charAt(indexOf2) == 'Z') {
                    if (str.length() != indexOf2 + 1) {
                        throw new ParseException(hl5.n("Failed to parse timestamp: invalid trailing data \"", str.substring(indexOf2), "\""), 0);
                    }
                } else {
                    String substring3 = str.substring(indexOf2 + 1);
                    int indexOf4 = substring3.indexOf(58);
                    if (indexOf4 != -1) {
                        try {
                            long parseLong = ((Long.parseLong(substring3.substring(0, indexOf4)) * 60) + Long.parseLong(substring3.substring(indexOf4 + 1))) * 60;
                            if (str.charAt(indexOf2) == '+') {
                                time -= parseLong;
                            } else {
                                time += parseLong;
                            }
                        } catch (NumberFormatException e) {
                            ParseException parseException = new ParseException("Invalid offset value: ".concat(substring3), 0);
                            parseException.initCause(e);
                            throw parseException;
                        }
                    } else {
                        throw new ParseException("Invalid offset value: ".concat(substring3), 0);
                    }
                }
                if (time >= -62135596800L && time <= 253402300799L) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    if (z) {
                        if (i <= -1000000000 || i >= 1000000000) {
                            long j = i / 1000000000;
                            long j2 = time + j;
                            if ((j ^ time) < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if ((time ^ j2) >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 | z3) {
                                i %= 1000000000;
                                time = j2;
                            } else {
                                throw new ArithmeticException();
                            }
                        }
                        if (i < 0) {
                            i += 1000000000;
                            long j3 = time - 1;
                            if ((1 ^ time) >= 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if ((time ^ j3) < 0) {
                                z5 = false;
                            }
                            if (z4 | z5) {
                                time = j3;
                            } else {
                                throw new ArithmeticException();
                            }
                        }
                        u8e x = v8e.x();
                        x.f(time);
                        x.e(i);
                        v8e v8eVar = (v8e) x.b();
                        b(v8eVar);
                        return v8eVar;
                    }
                    throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + time + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
                } catch (IllegalArgumentException e2) {
                    ParseException parseException2 = new ParseException(hl5.n("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
                    parseException2.initCause(e2);
                    throw parseException2;
                }
            }
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        throw new ParseException(hl5.n("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
    }

    public static void b(v8e v8eVar) {
        long w = v8eVar.w();
        int t = v8eVar.t();
        if (w >= -62135596800L && w <= 253402300799L && t >= 0 && t < 1000000000) {
            return;
        }
        hfd.k("Timestamp is not valid. See proto definition for valid values. Seconds (", w, ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (", t, ") must be in range [0, +999,999,999].");
    }
}
