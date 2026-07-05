package defpackage;

import android.database.Cursor;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q9b  reason: default package */
/* loaded from: classes.dex */
public final class q9b extends s9b {
    public String[] C;
    public byte[][] D;
    public Cursor E;
    public int[] d;
    public long[] e;
    public double[] f;

    public static void G(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        oue.K(25, "column index out of range");
        throw null;
    }

    public final void C() {
        if (this.E == null) {
            this.E = this.a.g0(new g99(this, 8));
        }
    }

    public final Cursor Q() {
        Cursor cursor = this.E;
        if (cursor != null) {
            return cursor;
        }
        oue.K(21, "no row");
        throw null;
    }

    @Override // defpackage.iw9
    public final boolean Z0() {
        o();
        C();
        Cursor cursor = this.E;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        vs.k("Required value was null.");
        return false;
    }

    @Override // defpackage.iw9
    public final void b0(int i, String str) {
        str.getClass();
        o();
        q(3, i);
        this.d[i] = 3;
        this.C[i] = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            o();
            this.d = new int[0];
            this.e = new long[0];
            this.f = new double[0];
            this.C = new String[0];
            this.D = new byte[0];
            reset();
        }
        this.c = true;
    }

    @Override // defpackage.iw9
    public final byte[] getBlob(int i) {
        o();
        Cursor Q = Q();
        G(Q, i);
        byte[] blob = Q.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.iw9
    public final int getColumnCount() {
        o();
        C();
        Cursor cursor = this.E;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.iw9
    public final String getColumnName(int i) {
        o();
        C();
        Cursor cursor = this.E;
        if (cursor != null) {
            G(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        vs.k("Required value was null.");
        return null;
    }

    @Override // defpackage.iw9
    public final long getLong(int i) {
        o();
        Cursor Q = Q();
        G(Q, i);
        return Q.getLong(i);
    }

    @Override // defpackage.iw9
    public final boolean isNull(int i) {
        o();
        Cursor Q = Q();
        G(Q, i);
        return Q.isNull(i);
    }

    @Override // defpackage.iw9
    public final void m(int i, long j) {
        o();
        q(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // defpackage.iw9
    public final void p(byte[] bArr, int i) {
        o();
        q(4, i);
        this.d[i] = 4;
        this.D[i] = bArr;
    }

    public final void q(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[][] bArr = this.D;
                        if (bArr.length < i3) {
                            this.D = (byte[][]) Arrays.copyOf(bArr, i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.C;
                if (strArr.length < i3) {
                    this.C = (String[]) Arrays.copyOf(strArr, i3);
                    return;
                }
                return;
            }
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        long[] jArr = this.e;
        if (jArr.length < i3) {
            this.e = Arrays.copyOf(jArr, i3);
        }
    }

    @Override // defpackage.iw9
    public final void r(int i) {
        o();
        q(5, i);
        this.d[i] = 5;
    }

    @Override // defpackage.iw9
    public final void reset() {
        o();
        Cursor cursor = this.E;
        if (cursor != null) {
            cursor.close();
        }
        this.E = null;
    }

    @Override // defpackage.iw9
    public final String s0(int i) {
        o();
        Cursor Q = Q();
        G(Q, i);
        String string = Q.getString(i);
        string.getClass();
        return string;
    }
}
