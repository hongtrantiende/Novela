package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wg4  reason: default package */
/* loaded from: classes3.dex */
public final class wg4 {
    public static gh2 a(w9a w9aVar, bp9 bp9Var, m41 m41Var, vt4 vt4Var) {
        ks3 ks3Var = ks3.a;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new gh2(new ie4(w9aVar, new cl7(m41Var, 4), vt4Var), tl1.A(new cv0(ks3Var, null, 25)), bp9Var, m41Var);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new gh2(new ie4(w9aVar, new dw3(26), vt4Var), tl1.A(new cv0(ks3Var, null, 25)), bp9Var, m41Var);
        }
    }

    public static void c(File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            if (parentFile.exists() && !parentFile.isDirectory() && c16.i(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
                hfd.i(parentFile, "Failed to delete conflicting file: ");
            } else if (!parentFile.isDirectory()) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                    } catch (Exception e) {
                        throw new IOException("Failed to create directory: " + parentFile, e);
                    }
                } else if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                    hfd.i(parentFile, "Failed to create directory: ");
                }
            }
        }
    }

    public static int d(Set set) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean contains = set.contains(PosixFilePermission.OWNER_READ);
        boolean contains2 = set.contains(PosixFilePermission.OWNER_WRITE);
        boolean contains3 = set.contains(PosixFilePermission.OWNER_EXECUTE);
        int i9 = 4;
        if (contains) {
            i = 4;
        } else {
            i = 0;
        }
        if (contains2) {
            i2 = i | 2;
        } else {
            i2 = i & (-3);
        }
        if (contains3) {
            i3 = i2 | 1;
        } else {
            i3 = i2 & (-2);
        }
        boolean contains4 = set.contains(PosixFilePermission.GROUP_READ);
        boolean contains5 = set.contains(PosixFilePermission.GROUP_WRITE);
        boolean contains6 = set.contains(PosixFilePermission.GROUP_EXECUTE);
        if (contains4) {
            i4 = 4;
        } else {
            i4 = 0;
        }
        if (contains5) {
            i5 = i4 | 2;
        } else {
            i5 = i4 & (-3);
        }
        if (contains6) {
            i6 = i5 | 1;
        } else {
            i6 = i5 & (-2);
        }
        boolean contains7 = set.contains(PosixFilePermission.OTHERS_READ);
        boolean contains8 = set.contains(PosixFilePermission.OTHERS_WRITE);
        boolean contains9 = set.contains(PosixFilePermission.OTHERS_EXECUTE);
        if (!contains7) {
            i9 = 0;
        }
        if (contains8) {
            i7 = i9 | 2;
        } else {
            i7 = i9 & (-3);
        }
        if (contains9) {
            i8 = i7 | 1;
        } else {
            i8 = i7 & (-2);
        }
        return eze.o(eze.o(eze.o(eze.o(0, i3, 6, 3), i6, 3, 3), i8, 0, 3), 0, 9, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.yh0 r5, java.io.File r6, defpackage.l6d r7, java.lang.String r8, defpackage.n42 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.sh0
            if (r0 == 0) goto L13
            r0 = r9
            sh0 r0 = (defpackage.sh0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            sh0 r0 = new sh0
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r4 = r0.d
            int r9 = r0.f
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L32
            if (r9 != r2) goto L2c
            java.lang.String r8 = r0.c
            l6d r7 = r0.b
            yh0 r5 = r0.a
            defpackage.hre.r(r4)     // Catch: java.nio.file.NoSuchFileException -> L5c
            goto L4b
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r1
        L32:
            defpackage.hre.r(r4)
            jq r4 = new jq     // Catch: java.nio.file.NoSuchFileException -> L5c
            r4.<init>(r6, r7, r1, r2)     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.a = r5     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.b = r7     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.c = r8     // Catch: java.nio.file.NoSuchFileException -> L5c
            r0.f = r2     // Catch: java.nio.file.NoSuchFileException -> L5c
            java.lang.Object r4 = defpackage.qye.k(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L5c
            n82 r6 = defpackage.n82.a
            if (r4 != r6) goto L4b
            return r6
        L4b:
            java.io.RandomAccessFile r4 = (java.io.RandomAccessFile) r4     // Catch: java.nio.file.NoSuchFileException -> L5c
            vh0 r6 = new vh0     // Catch: java.nio.file.NoSuchFileException -> L5c
            r6.<init>(r4, r7, r5, r8)     // Catch: java.nio.file.NoSuchFileException -> L5c
            long r4 = r4.getFilePointer()     // Catch: java.nio.file.NoSuchFileException -> L5c
            v20 r7 = new v20     // Catch: java.nio.file.NoSuchFileException -> L5c
            r7.<init>(r6, r4)     // Catch: java.nio.file.NoSuchFileException -> L5c
            return r7
        L5c:
            r4 = move-exception
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg4.b(yh0, java.io.File, l6d, java.lang.String, n42):java.lang.Object");
    }
}
