package j$.time.format;

import j$.time.DayOfWeek;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class s extends j {
    public final char g;
    public final int h;

    public s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, SignStyle.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        return f(vVar.a.b).A(vVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new s(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final j f(Locale locale) {
        j$.time.temporal.t tVar;
        SignStyle signStyle;
        ConcurrentMap concurrentMap = j$.time.temporal.u.g;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        int i = ((int) ((firstDayOfWeek - 1) % 7)) + 7;
        j$.time.temporal.u a = j$.time.temporal.u.a(DayOfWeek.a[(i + DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c != 'W') {
            if (c != 'Y') {
                if (c != 'c' && c != 'e') {
                    if (c == 'w') {
                        tVar = a.e;
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                } else {
                    tVar = a.c;
                }
            } else {
                j$.time.temporal.t tVar2 = a.f;
                int i2 = this.h;
                if (i2 == 2) {
                    return new p(tVar2, 2, 2, p.h, this.e);
                }
                if (i2 < 4) {
                    signStyle = SignStyle.NORMAL;
                } else {
                    signStyle = SignStyle.EXCEEDS_PAD;
                }
                return new j(tVar2, i2, 19, signStyle, this.e);
            }
        } else {
            tVar = a.d;
        }
        return new j(tVar, this.b, this.c, SignStyle.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j
    public final String toString() {
        SignStyle signStyle;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c == 'Y') {
            if (i == 1) {
                sb.append("WeekBasedYear");
            } else if (i == 2) {
                sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb.append("WeekBasedYear,");
                sb.append(i);
                sb.append(",19,");
                if (i < 4) {
                    signStyle = SignStyle.NORMAL;
                } else {
                    signStyle = SignStyle.EXCEEDS_PAD;
                }
                sb.append(signStyle);
            }
        } else {
            if (c != 'W') {
                if (c != 'c' && c != 'e') {
                    if (c == 'w') {
                        sb.append("WeekOfWeekBasedYear");
                    }
                } else {
                    sb.append("DayOfWeek");
                }
            } else {
                sb.append("WeekOfMonth");
            }
            sb.append(",");
            sb.append(i);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // j$.time.format.j, j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        return f(xVar.b.b).v(xVar, sb);
    }
}
