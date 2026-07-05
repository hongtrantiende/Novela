package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ref  reason: default package */
/* loaded from: classes.dex */
public abstract class ref implements sgf {
    public final ref a;
    public final UUID b;
    public final String c;
    public final String d;
    public Thread e;

    public ref(String str, ref refVar, qgf qgfVar) {
        this.d = str;
        this.a = refVar;
        this.b = refVar.b;
        this.c = refVar.c;
        this.e = Thread.currentThread();
    }

    public static String o(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qgf c = kff.c();
        sgf sgfVar = c.b;
        String str = this.d;
        if (sgfVar != null) {
            if (this == sgfVar) {
                kff.b(c, ((ref) sgfVar).a);
                this.e = null;
                return;
            }
            String str2 = ((ref) sgfVar).d;
            StringBuilder sb = new StringBuilder(str.length() + 79 + str2.length() + 1);
            nk2.C(sb, "Tried to end span ", str, ", but that span is not the current span. The current span is ", str2);
            sb.append(".");
            throw new bj1(sb.toString(), 11);
        }
        throw new bj1(nk2.v(new StringBuilder(str.length() + 101), "Tried to end [", str, "], but no trace was active. This is caused by mismatched or missing calls to beginSpan."), 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r9 = r9.d;
        r15 = java.lang.Integer.valueOf(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        if (r9.containsKey(r15) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
        ((defpackage.ngf) r1.g).d.put(r15, new defpackage.ngf(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
        if (r14 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
        r14.c = (defpackage.ngf) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00de, code lost:
        if (r14 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e0, code lost:
        r14.c = (defpackage.ngf) r1.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
        r1.b = r7;
        r1.c++;
        r1.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ec, code lost:
        if (r1.g(r13, r14, r15, (r15 + r14) - r13) != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ref.toString():java.lang.String");
    }

    public ref(String str, UUID uuid, String str2, qgf qgfVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        qgfVar.getClass();
        this.e = Thread.currentThread();
    }
}
