package defpackage;

import com.google.firebase.auth.FirebaseAuthRegistrar;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w2e  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class w2e implements hu1, k1e {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public w2e(hr7 hr7Var, b9f b9fVar, HashMap hashMap) {
        this.a = 3;
        this.b = new ConcurrentHashMap();
        hr7Var.getClass();
        this.c = hr7Var;
        b9fVar.getClass();
        this.d = b9fVar;
        this.f = hashMap;
        wq9.s(!hashMap.isEmpty());
        this.e = s1f.c;
    }

    public boolean a(String str) {
        am8.p(str);
        return ((fz0) this.e).a.contains(str);
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((mf9) this.b, (mf9) this.c, (mf9) this.d, (mf9) this.e, (mf9) this.f, yvVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
        if (r7.equals("EMAIL_SIGNIN") == false) goto L62;
     */
    @Override // defpackage.k1e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String zza() {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2e.zza():java.lang.String");
    }

    public /* synthetic */ w2e(int i) {
        this.a = i;
    }
}
