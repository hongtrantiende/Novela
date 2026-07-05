package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class r implements e {
    public final TemporalField a;
    public final e0 b;
    public final a0 c;
    public volatile j d;

    public r(TemporalField temporalField, e0 e0Var, a0 a0Var) {
        this.a = temporalField;
        this.b = e0Var;
        this.c = a0Var;
    }

    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        e0 e0Var;
        Iterator e;
        a0 a0Var = this.c;
        TemporalField temporalField = this.a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z = vVar.c;
            DateTimeFormatter dateTimeFormatter = vVar.a;
            if (z) {
                e0Var = this.b;
            } else {
                e0Var = null;
            }
            j$.time.chrono.j d = vVar.d();
            if (d != null && d != j$.time.chrono.q.c) {
                e = a0Var.d(d, temporalField, e0Var, dateTimeFormatter.b);
            } else {
                e = a0Var.e(temporalField, e0Var, dateTimeFormatter.b);
            }
            Iterator it = e;
            if (it != null) {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    if (vVar.h(str, 0, charSequence, i, str.length())) {
                        return vVar.g(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (temporalField == ChronoField.ERA && !vVar.c) {
                    for (j$.time.chrono.k kVar : d.z()) {
                        String obj = kVar.toString();
                        if (vVar.h(obj, 0, charSequence, i, obj.length())) {
                            return vVar.g(this.a, kVar.getValue(), i, obj.length() + i);
                        }
                    }
                }
                if (vVar.c) {
                    return ~i;
                }
            }
            if (this.d == null) {
                this.d = new j(this.a, 1, 19, SignStyle.NORMAL);
            }
            return this.d.A(vVar, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        e0 e0Var = e0.FULL;
        e0 e0Var2 = this.b;
        TemporalField temporalField = this.a;
        if (e0Var2 == e0Var) {
            return "Text(" + temporalField + ")";
        }
        return "Text(" + temporalField + "," + e0Var2 + ")";
    }

    @Override // j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        String c;
        Long a = xVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = xVar.b;
        if (a == null) {
            return false;
        }
        j$.time.chrono.j jVar = (j$.time.chrono.j) xVar.a.d(j$.time.temporal.p.b);
        if (jVar != null && jVar != j$.time.chrono.q.c) {
            c = this.c.b(jVar, this.a, a.longValue(), this.b, dateTimeFormatter.b);
        } else {
            c = this.c.c(this.a, a.longValue(), this.b, dateTimeFormatter.b);
        }
        if (c == null) {
            if (this.d == null) {
                this.d = new j(this.a, 1, 19, SignStyle.NORMAL);
            }
            return this.d.v(xVar, sb);
        }
        sb.append(c);
        return true;
    }
}
