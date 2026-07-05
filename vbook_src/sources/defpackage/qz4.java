package defpackage;

import android.accounts.Account;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qz4  reason: default package */
/* loaded from: classes.dex */
public abstract class qz4 extends rh0 {
    public final Set z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qz4(android.content.Context r10, android.os.Looper r11, int r12, defpackage.yv r13, defpackage.wz4 r14, defpackage.xz4 r15, int r16) {
        /*
            r9 = this;
            w6f r3 = defpackage.w6f.a(r10)
            uz4 r4 = defpackage.uz4.e
            defpackage.am8.s(r14)
            defpackage.am8.s(r15)
            bp9 r6 = new bp9
            r0 = 11
            r6.<init>(r14, r0)
            k57 r7 = new k57
            r14 = 18
            r7.<init>(r15, r14)
            java.lang.Object r14 = r13.d
            r8 = r14
            java.lang.String r8 = (java.lang.String) r8
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r10 = r13.b
            java.util.Set r10 = (java.util.Set) r10
            java.util.Iterator r11 = r10.iterator()
        L2e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L48
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L41
            goto L2e
        L41:
            java.lang.String r9 = "Expanding scopes is not permitted, use implied scopes instead"
            defpackage.vs.k(r9)
            r9 = 0
            throw r9
        L48:
            r9.z = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz4.<init>(android.content.Context, android.os.Looper, int, yv, wz4, xz4, int):void");
    }

    @Override // defpackage.rh0
    public final Account e() {
        return null;
    }

    @Override // defpackage.rh0
    public final Executor g() {
        return null;
    }

    @Override // defpackage.rh0
    public final Set k() {
        return this.z;
    }
}
