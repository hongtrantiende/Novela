package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m66  reason: default package */
/* loaded from: classes3.dex */
public class m66 extends pe4 {
    public static ArrayList l1(hn8 hn8Var, boolean z) {
        File file = hn8Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (z) {
                if (!file.exists()) {
                    fb4.h(hn8Var, "no such file: ");
                    return null;
                }
                hfd.i(hn8Var, "failed to list ");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(hn8Var.e(str));
        }
        wl1.N(arrayList);
        return arrayList;
    }

    @Override // defpackage.pe4
    public yd4 I0(hn8 hn8Var) {
        hn8Var.getClass();
        File file = hn8Var.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new yd4(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null);
    }

    @Override // defpackage.pe4
    public final x56 N0(hn8 hn8Var) {
        return new x56(false, new RandomAccessFile(hn8Var.toFile(), "r"));
    }

    @Override // defpackage.pe4
    public final void Q(hn8 hn8Var) {
        hn8Var.getClass();
        if (!hn8Var.toFile().mkdir()) {
            yd4 I0 = I0(hn8Var);
            if (I0 == null || !I0.b) {
                hfd.i(hn8Var, "failed to create directory: ");
            }
        }
    }

    @Override // defpackage.pe4
    public final void V(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        if (!Thread.interrupted()) {
            File file = hn8Var.toFile();
            if (!file.delete()) {
                if (!file.exists()) {
                    if (z) {
                        fb4.h(hn8Var, "no such file: ");
                        return;
                    }
                    return;
                }
                hfd.i(hn8Var, "failed to delete ");
                return;
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // defpackage.pe4
    public final x56 V0(hn8 hn8Var) {
        hn8Var.getClass();
        return new x56(true, new RandomAccessFile(hn8Var.toFile(), "rw"));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [dac, java.lang.Object] */
    @Override // defpackage.pe4
    public final yma g1(hn8 hn8Var, boolean z) {
        hn8Var.getClass();
        if (z && j0(hn8Var)) {
            throw new IOException(hn8Var + " already exists.");
        }
        return new lg8(new FileOutputStream(hn8Var.toFile(), false), new Object());
    }

    @Override // defpackage.pe4
    public final osa k1(hn8 hn8Var) {
        hn8Var.getClass();
        return tl1.J(hn8Var.toFile());
    }

    @Override // defpackage.pe4
    public final List m0(hn8 hn8Var) {
        hn8Var.getClass();
        ArrayList l1 = l1(hn8Var, true);
        l1.getClass();
        return l1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dac, java.lang.Object] */
    @Override // defpackage.pe4
    public final yma o(hn8 hn8Var) {
        hn8Var.getClass();
        return new lg8(new FileOutputStream(hn8Var.toFile(), true), new Object());
    }

    @Override // defpackage.pe4
    public final List p0(hn8 hn8Var) {
        hn8Var.getClass();
        return l1(hn8Var, false);
    }

    @Override // defpackage.pe4
    public void q(hn8 hn8Var, hn8 hn8Var2) {
        hn8Var.getClass();
        hn8Var2.getClass();
        if (hn8Var.toFile().renameTo(hn8Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + hn8Var + " to " + hn8Var2);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
