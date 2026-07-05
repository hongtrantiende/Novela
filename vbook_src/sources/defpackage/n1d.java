package defpackage;

import j$.time.format.DateTimeFormatter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n1d  reason: default package */
/* loaded from: classes3.dex */
public final class n1d implements s76 {
    public static final n1d a = new Object();
    public static final y59 b = aze.e("kotlinx.datetime.UtcOffset", w59.n);

    @Override // defpackage.s76
    public final void a(jbe jbeVar, Object obj) {
        f1d f1dVar = (f1d) obj;
        f1dVar.getClass();
        jbeVar.I(f1dVar.toString());
    }

    @Override // defpackage.s76
    public final Object c(yq2 yq2Var) {
        e1d e1dVar = f1d.Companion;
        String s = yq2Var.s();
        mfb mfbVar = i1d.a;
        h1d h1dVar = (h1d) mfbVar.getValue();
        e1dVar.getClass();
        s.getClass();
        h1dVar.getClass();
        if (h1dVar == ((h1d) mfbVar.getValue())) {
            DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) k1d.a.getValue();
            dateTimeFormatter.getClass();
            return k1d.a(s, dateTimeFormatter);
        } else if (h1dVar == ((h1d) i1d.b.getValue())) {
            DateTimeFormatter dateTimeFormatter2 = (DateTimeFormatter) k1d.b.getValue();
            dateTimeFormatter2.getClass();
            return k1d.a(s, dateTimeFormatter2);
        } else if (h1dVar == ((h1d) i1d.c.getValue())) {
            DateTimeFormatter dateTimeFormatter3 = (DateTimeFormatter) k1d.c.getValue();
            dateTimeFormatter3.getClass();
            return k1d.a(s, dateTimeFormatter3);
        } else {
            return (f1d) h1dVar.c(s);
        }
    }

    @Override // defpackage.s76
    public final o9a e() {
        return b;
    }
}
