package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import org.mozilla.javascript.Token;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.m {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;
    public static final Month[] a;
    public static final /* synthetic */ Month[] b;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r10v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v2, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v2, types: [j$.time.Month, java.lang.Enum] */
    static {
        ?? r0 = new Enum("JANUARY", 0);
        JANUARY = r0;
        ?? r1 = new Enum("FEBRUARY", 1);
        FEBRUARY = r1;
        ?? r2 = new Enum("MARCH", 2);
        MARCH = r2;
        ?? r3 = new Enum("APRIL", 3);
        APRIL = r3;
        ?? r4 = new Enum("MAY", 4);
        MAY = r4;
        ?? r5 = new Enum("JUNE", 5);
        JUNE = r5;
        ?? r6 = new Enum("JULY", 6);
        JULY = r6;
        ?? r7 = new Enum("AUGUST", 7);
        AUGUST = r7;
        ?? r8 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r8;
        ?? r9 = new Enum("OCTOBER", 9);
        OCTOBER = r9;
        ?? r10 = new Enum("NOVEMBER", 10);
        NOVEMBER = r10;
        ?? r11 = new Enum("DECEMBER", 11);
        DECEMBER = r11;
        b = new Month[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11};
        a = values();
    }

    public static Month I(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        e.b("Invalid value for MonthOfYear: ", i);
        return null;
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) b.clone();
    }

    public final int A(boolean z) {
        int i = j.a[ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return 31;
            }
            return 30;
        } else if (z) {
            return 29;
        } else {
            return 28;
        }
    }

    public final int F() {
        int i = j.a[ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4 && i != 5) {
                return 31;
            }
            return 30;
        }
        return 29;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b) {
            return j$.time.chrono.q.c;
        }
        if (temporalQuery == j$.time.temporal.p.c) {
            return j$.time.temporal.a.MONTHS;
        }
        return super.d(temporalQuery);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l f(j$.time.temporal.l lVar) {
        if (j$.time.chrono.j.q(lVar).equals(j$.time.chrono.q.c)) {
            return lVar.a(getValue(), ChronoField.MONTH_OF_YEAR);
        }
        e.a("Adjustment only supported on ISO date-time");
        return null;
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int h(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return super.h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean i(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.MONTH_OF_YEAR) {
                return true;
            }
            return false;
        } else if (temporalField != null && temporalField.v(this)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long k(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.N(this);
        }
        throw new DateTimeException(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s l(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.I();
        }
        return super.l(temporalField);
    }

    public final int v(boolean z) {
        switch (j.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + Token.USE_STACK;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + Token.DOT;
            case 9:
                return (z ? 1 : 0) + Token.TEMPLATE_LITERAL_SUBST;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }
}
