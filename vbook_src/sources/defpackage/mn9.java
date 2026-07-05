package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mn9  reason: default package */
/* loaded from: classes.dex */
public final class mn9 implements fea {
    public static final int g;
    public static final gm9 h;
    public final t9c a;
    public final ig4 b;
    public final ky c;
    public final nn9 d;
    public final dea e;
    public final sw7 f;

    static {
        hq7 hq7Var = wl3.b;
        g = (int) wl3.i(jue.O(24, am3.HOURS), am3.SECONDS);
        h = new gm9("com/google/firebase/sessions//");
    }

    public mn9(t9c t9cVar, ig4 ig4Var, ky kyVar, nn9 nn9Var, dea deaVar) {
        t9cVar.getClass();
        ig4Var.getClass();
        kyVar.getClass();
        nn9Var.getClass();
        deaVar.getClass();
        this.a = t9cVar;
        this.b = ig4Var;
        this.c = kyVar;
        this.d = nn9Var;
        this.e = deaVar;
        this.f = new sw7();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(3:(1:(5:11|12|13|14|15)(2:21|22))(5:23|24|25|26|(3:28|29|30)(4:31|(1:33)|(3:36|14|15)|35))|19|20)(1:39))(2:51|(1:56)(1:55))|40|41|(3:43|44|45)(3:46|(3:48|26|(0)(0))|35)))|58|6|(0)(0)|40|41|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
        if (r1.o(r3) == r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0087, code lost:
        r2 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:34:0x0077, B:36:0x007d, B:41:0x008a), top: B:61:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: all -> 0x0086, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0086, blocks: (B:34:0x0077, B:36:0x007d, B:41:0x008a), top: B:61:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x009f, B:47:0x00a9, B:50:0x00b2), top: B:62:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x009f, B:47:0x00a9, B:50:0x00b2), top: B:62:0x004a }] */
    /* JADX WARN: Type inference failed for: r4v9, types: [qw7] */
    @Override // defpackage.fea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.m42 r22) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn9.a(m42):java.lang.Object");
    }

    @Override // defpackage.fea
    public final Boolean b() {
        return this.e.a().a;
    }

    @Override // defpackage.fea
    public final wl3 c() {
        Integer num = this.e.a().c;
        if (num != null) {
            hq7 hq7Var = wl3.b;
            return new wl3(jue.O(num.intValue(), am3.SECONDS));
        }
        return null;
    }

    @Override // defpackage.fea
    public final Double d() {
        return this.e.a().b;
    }
}
