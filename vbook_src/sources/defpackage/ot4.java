package defpackage;

import android.database.sqlite.SQLiteProgram;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ot4  reason: default package */
/* loaded from: classes.dex */
public class ot4 implements o9b {
    public final SQLiteProgram a;

    public ot4(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // defpackage.o9b
    public final void B0(double d, int i) {
        this.a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.o9b
    public final void g(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // defpackage.o9b
    public final void m(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.o9b
    public final void p(byte[] bArr, int i) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.o9b
    public final void r(int i) {
        this.a.bindNull(i);
    }
}
