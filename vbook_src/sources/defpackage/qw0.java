package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qw0  reason: default package */
/* loaded from: classes3.dex */
public final class qw0 implements mw0 {
    public final ii2 a;
    public final lw0 b;

    static {
        r76[] r76VarArr = lw0.h;
    }

    public qw0(ii2 ii2Var, lw0 lw0Var) {
        this.a = ii2Var;
        this.b = lw0Var;
    }

    public final List a() {
        return tl1.B(new kx0("google", "Google", "https://www.google.com/search?ie=UTF-8&oe=UTF-8&q=%s"), new kx0("bing", "Bing", "https://www.bing.com/search?q=%s"), new kx0("duckduckgo", "Duckduckgo", "https://duckduckgo.com/?q=%s"), new kx0("baidu", "Baidu", "https://www.baidu.com/s?wd=%s"), new kx0("yandex", "Yandex", "https://yandex.ru/yandsearch?lr=21411&text=%s"));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[EDGE_INSN: B:30:0x006c->B:24:0x006c ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.n42 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.nw0
            if (r0 == 0) goto L13
            r0 = r8
            nw0 r0 = (defpackage.nw0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nw0 r0 = new nw0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L50
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r2
        L2e:
            defpackage.hre.r(r8)
            lw0 r8 = r7.b
            u68 r1 = r8.c
            r76[] r4 = defpackage.lw0.h
            r5 = 2
            r4 = r4[r5]
            java.lang.Object r8 = r1.c(r4, r8)
            java.lang.String r8 = (java.lang.String) r8
            r0.a = r8
            r0.d = r3
            java.util.List r7 = r7.a()
            n82 r0 = defpackage.n82.a
            if (r7 != r0) goto L4d
            return r0
        L4d:
            r6 = r8
            r8 = r7
            r7 = r6
        L50:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r0 = r8.iterator()
        L56:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            r3 = r1
            kx0 r3 = (defpackage.kx0) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L56
            r2 = r1
        L6c:
            kx0 r2 = (defpackage.kx0) r2
            if (r2 != 0) goto L77
            java.lang.Object r7 = defpackage.sl1.c0(r8)
            kx0 r7 = (defpackage.kx0) r7
            return r7
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw0.b(n42):java.lang.Object");
    }
}
