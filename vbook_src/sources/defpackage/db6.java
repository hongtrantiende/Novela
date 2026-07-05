package defpackage;

import android.content.Context;
import android.os.Build;
import baidu.lac.jni.LacLib;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: db6  reason: default package */
/* loaded from: classes3.dex */
public final class db6 implements ww7 {
    public static final boolean e;
    public final Context a;
    public final sw7 b;
    public lj c;
    public boolean d;

    static {
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        boolean z = false;
        for (String str : strArr) {
            if (c16.i(str, "arm64-v8a") || c16.i(str, "armeabi-v7a")) {
                z = true;
                break;
            }
        }
        e = z;
    }

    public db6() {
        Context context = twe.e;
        context.getClass();
        this.a = context;
        this.b = new sw7();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        lj ljVar = this.c;
        this.c = null;
        if (ljVar != null) {
            ReentrantLock reentrantLock = ljVar.c;
            reentrantLock.lock();
            try {
                long j = ljVar.d;
                if (j != 0) {
                    LacLib.destroy(j);
                    ljVar.d = 0L;
                }
                ljVar.e = true;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r8 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // defpackage.ww7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e1(java.lang.String r7, defpackage.n42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bb6
            if (r0 == 0) goto L13
            r0 = r8
            bb6 r0 = (defpackage.bb6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bb6 r0 = new bb6
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            goto L5e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            java.lang.String r7 = r0.a
            defpackage.hre.r(r8)
            goto L45
        L37:
            defpackage.hre.r(r8)
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r6.o(r0)
            if (r8 != r5) goto L45
            goto L5d
        L45:
            lj r8 = (defpackage.lj) r8
            if (r8 != 0) goto L4c
            ks3 r6 = defpackage.ks3.a
            return r6
        L4c:
            r0.a = r2
            r0.d = r3
            sw2 r6 = defpackage.ab3.a
            db r1 = new db
            r1.<init>(r8, r7, r2, r4)
            java.lang.Object r8 = defpackage.z87.E(r6, r1, r0)
            if (r8 != r5) goto L5e
        L5d:
            return r5
        L5e:
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r8.size()
            r6.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L6d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb8
            java.lang.Object r8 = r7.next()
            eb6 r8 = (defpackage.eb6) r8
            java.lang.String r0 = r8.b
            int r1 = r0.hashCode()
            switch(r1) {
                case 75552: goto La3;
                case 78532: goto L98;
                case 79101: goto L8e;
                case 2575053: goto L83;
                default: goto L82;
            }
        L82:
            goto L6d
        L83:
            java.lang.String r1 = "TIME"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            goto L6d
        L8c:
            r0 = 3
            goto Lad
        L8e:
            java.lang.String r1 = "PER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6d
            r0 = 0
            goto Lad
        L98:
            java.lang.String r1 = "ORG"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto La1
            goto L6d
        La1:
            r0 = r3
            goto Lad
        La3:
            java.lang.String r1 = "LOC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lac
            goto L6d
        Lac:
            r0 = r4
        Lad:
            vw7 r1 = new vw7
            java.lang.String r8 = r8.a
            r1.<init>(r8, r0)
            r6.add(r1)
            goto L6d
        Lb8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db6.e1(java.lang.String, n42):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053 A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #2 {all -> 0x0095, blocks: (B:24:0x004d, B:27:0x0053, B:34:0x0082, B:38:0x008f, B:37:0x0089, B:30:0x0058), top: B:44:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(defpackage.n42 r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.a
            boolean r1 = r7 instanceof defpackage.cb6
            if (r1 == 0) goto L15
            r1 = r7
            cb6 r1 = (defpackage.cb6) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            cb6 r1 = new cb6
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.b
            int r2 = r1.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            sw7 r1 = r1.a
            defpackage.hre.r(r7)
            goto L4d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L30:
            defpackage.hre.r(r7)
            boolean r7 = r6.d
            if (r7 == 0) goto L38
            return r4
        L38:
            lj r7 = r6.c
            if (r7 == 0) goto L3d
            return r7
        L3d:
            sw7 r7 = r6.b
            r1.a = r7
            r1.d = r3
            java.lang.Object r1 = r7.o(r1)
            n82 r2 = defpackage.n82.a
            if (r1 != r2) goto L4c
            return r2
        L4c:
            r1 = r7
        L4d:
            boolean r7 = r6.d     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L53
            r7 = r4
            goto L91
        L53:
            lj r7 = r6.c     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L58
            goto L91
        L58:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L7b
            java.io.File r2 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = "analyzer/model"
            r7.<init>(r2, r5)     // Catch: java.lang.Throwable -> L7b
            ab6 r2 = new ab6     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L7b
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L7b
            lj r7 = new lj     // Catch: java.lang.Throwable -> L7b
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L7b
            r0.getClass()     // Catch: java.lang.Throwable -> L7b
            r7.<init>(r0, r2)     // Catch: java.lang.Throwable -> L7b
            r6.c = r7     // Catch: java.lang.Throwable -> L7b
            goto L82
        L7b:
            r7 = move-exception
            gs9 r0 = new gs9     // Catch: java.lang.Throwable -> L95
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L95
            r7 = r0
        L82:
            java.lang.Throwable r0 = defpackage.hs9.a(r7)     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto L89
            goto L8f
        L89:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L95
            r6.d = r3     // Catch: java.lang.Throwable -> L95
            r7 = r4
        L8f:
            lj r7 = (defpackage.lj) r7     // Catch: java.lang.Throwable -> L95
        L91:
            r1.q(r4)
            return r7
        L95:
            r6 = move-exception
            r1.q(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.db6.o(n42):java.lang.Object");
    }
}
