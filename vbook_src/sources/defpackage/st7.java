package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st7  reason: default package */
/* loaded from: classes.dex */
public final class st7 implements dz5 {
    public final d82 a;
    public final File b;
    public final xa1 c;
    public final String d;
    public final String e;
    public final String f;
    public final sw7 g;
    public final mfb h;
    public final mfb i;

    public st7(d82 d82Var, File file) {
        d82Var.getClass();
        file.getClass();
        this.a = d82Var;
        this.b = file;
        Object obj = eu7.b;
        this.c = new xa1(new qq4(file, null, 24), gs3.a, -2, py0.a);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new sw7();
        this.h = new mfb(new vt4(this) { // from class: nt7
            public final /* synthetic */ st7 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptor;
                int i = r2;
                st7 st7Var = this.b;
                switch (i) {
                    case 0:
                        File file2 = new File(st7Var.b.getAbsolutePath() + st7Var.d);
                        st7.f(file2);
                        return file2;
                    default:
                        hga.a.getClass();
                        File file3 = new File(st7Var.b.getAbsolutePath() + st7Var.e);
                        st7.f(file3);
                        gga ggaVar = null;
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptor.getClass();
                                NativeSharedCounter nativeSharedCounter = fga.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptor.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (nativeCreateSharedCounter >= 0) {
                                            ggaVar = new gga(nativeSharedCounter, nativeCreateSharedCounter);
                                        } else {
                                            fb4.k("Failed to mmap counter file");
                                        }
                                    } else {
                                        fb4.k("Failed to truncate counter file");
                                    }
                                } else {
                                    vs.k("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptor.close();
                                return ggaVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
        this.i = new mfb(new vt4(this) { // from class: nt7
            public final /* synthetic */ st7 b;

            {
                this.b = this;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptor;
                int i = r2;
                st7 st7Var = this.b;
                switch (i) {
                    case 0:
                        File file2 = new File(st7Var.b.getAbsolutePath() + st7Var.d);
                        st7.f(file2);
                        return file2;
                    default:
                        hga.a.getClass();
                        File file3 = new File(st7Var.b.getAbsolutePath() + st7Var.e);
                        st7.f(file3);
                        gga ggaVar = null;
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptor.getClass();
                                NativeSharedCounter nativeSharedCounter = fga.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptor.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long nativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (nativeCreateSharedCounter >= 0) {
                                            ggaVar = new gga(nativeSharedCounter, nativeCreateSharedCounter);
                                        } else {
                                            fb4.k("Failed to mmap counter file");
                                        }
                                    } else {
                                        fb4.k("Failed to truncate counter file");
                                    }
                                } else {
                                    vs.k("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptor.close();
                                return ggaVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptor != null) {
                                    parcelFileDescriptor.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptor = null;
                        }
                }
            }
        });
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                hfd.i(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    @Override // defpackage.dz5
    public final Object a(n42 n42Var) {
        mfb mfbVar = this.i;
        if (mfbVar.d()) {
            gga ggaVar = (gga) ((hga) mfbVar.getValue());
            return new Integer(ggaVar.b.nativeGetCounterValue(ggaVar.c));
        }
        return z87.E(this.a, new pt7(this, null, 0), n42Var);
    }

    @Override // defpackage.dz5
    public final Object b(fh2 fh2Var) {
        mfb mfbVar = this.i;
        if (mfbVar.d()) {
            gga ggaVar = (gga) ((hga) mfbVar.getValue());
            return new Integer(ggaVar.b.nativeIncrementAndGetCounterValue(ggaVar.c));
        }
        return z87.E(this.a, new pt7(this, null, 1), fh2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
        if (r10.o(r0) == r6) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[Catch: all -> 0x00b7, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00db, blocks: (B:30:0x007a, B:41:0x00b3, B:55:0x00d1, B:56:0x00d4), top: B:72:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #6 {all -> 0x00db, blocks: (B:30:0x007a, B:41:0x00b3, B:55:0x00d1, B:56:0x00d4), top: B:72:0x007a }] */
    /* JADX WARN: Type inference failed for: r0v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r9v7, types: [qw7] */
    @Override // defpackage.dz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.xt4 r9, defpackage.n42 r10) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st7.c(xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Type inference failed for: r19v0, types: [lu4] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [rt7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7, types: [qw7] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, int] */
    @Override // defpackage.dz5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.lu4 r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st7.d(lu4, n42):java.lang.Object");
    }

    @Override // defpackage.dz5
    public final sj4 e() {
        return this.c;
    }
}
