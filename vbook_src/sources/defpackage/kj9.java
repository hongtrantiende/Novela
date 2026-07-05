package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kj9  reason: default package */
/* loaded from: classes3.dex */
public final class kj9 extends OutputStream {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public kj9(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((lj9) this.b).close();
                return;
            default:
                return;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lj9 lj9Var = (lj9) obj;
                if (!lj9Var.c) {
                    lj9Var.flush();
                    return;
                }
                return;
            default:
                ((FileOutputStream) obj).flush();
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((lj9) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                lj9 lj9Var = (lj9) obj;
                if (!lj9Var.c) {
                    lj9Var.b.write(bArr, i, i2);
                    lj9Var.a0();
                    return;
                }
                fb4.k("closed");
                return;
            default:
                ((FileOutputStream) obj).write(bArr, i, i2);
                return;
        }
    }

    public kj9(lj9 lj9Var) {
        this.b = lj9Var;
    }

    private final void o() {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        switch (this.a) {
            case 1:
                bArr.getClass();
                ((FileOutputStream) this.b).write(bArr);
                return;
            default:
                super.write(bArr);
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                lj9 lj9Var = (lj9) obj;
                if (!lj9Var.c) {
                    lj9Var.b.k1((byte) i);
                    lj9Var.a0();
                    return;
                }
                fb4.k("closed");
                return;
            default:
                ((FileOutputStream) obj).write(i);
                return;
        }
    }
}
