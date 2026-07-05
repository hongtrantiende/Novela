package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tea  reason: default package */
/* loaded from: classes.dex */
public final class tea implements jsa {
    public static final int[] i = new int[3];
    public static final float[] j = {nae.e, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {nae.e, nae.e, 0.5f, 1.0f};
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public final Object h;

    public tea() {
        this.h = new Path();
        Paint paint = new Paint();
        this.g = paint;
        Paint paint2 = new Paint();
        this.d = paint2;
        this.a = tn1.d(-16777216, 68);
        this.b = tn1.d(-16777216, 20);
        this.c = tn1.d(-16777216, 0);
        paint2.setColor(this.a);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.e = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f = new Paint(paint3);
    }

    @Override // defpackage.jsa
    public void a(int i2, ByteBuffer byteBuffer) {
        ksa ksaVar = (ksa) this.h;
        byteBuffer.asShortBuffer().get((short[]) this.e, ksaVar.j * ksaVar.b, i2 / 2);
        byteBuffer.position(byteBuffer.position() + i2);
    }

    @Override // defpackage.jsa
    public void b(int i2, ByteBuffer byteBuffer) {
        int i3 = ((ksa) this.h).b;
        byteBuffer.asShortBuffer().put((short[]) this.f, 0, i2 * i3);
        byteBuffer.position((i2 * 2 * i3) + byteBuffer.position());
    }

    @Override // defpackage.jsa
    public void c(int i2, int i3) {
        for (int i4 = 0; i4 < ((ksa) this.h).b * i3; i4++) {
            ((short[]) this.e)[i2 + i4] = 0;
        }
    }

    @Override // defpackage.jsa
    public void d(int i2, int i3) {
        short[] sArr = (short[]) this.e;
        ksa ksaVar = (ksa) this.h;
        int i4 = ksaVar.h / i3;
        int i5 = ksaVar.b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            ((short[]) this.d)[i8] = (short) (i9 / i6);
        }
    }

    @Override // defpackage.jsa
    public int e(int i2, int i3, int i4) {
        return s((short[]) this.e, i2, i3, i4);
    }

    @Override // defpackage.jsa
    public void f() {
        this.c = this.a;
    }

    @Override // defpackage.jsa
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // defpackage.jsa
    public Object g() {
        return (short[]) this.e;
    }

    @Override // defpackage.jsa
    public Object h() {
        return (short[]) this.f;
    }

    @Override // defpackage.jsa
    public void i(long j2, long j3, int i2) {
        int i3 = 0;
        while (true) {
            ksa ksaVar = (ksa) this.h;
            int i4 = ksaVar.b;
            if (i3 < i4) {
                short[] sArr = (short[]) this.g;
                int i5 = (i2 * i4) + i3;
                short s = sArr[i5];
                short s2 = sArr[i5 + i4];
                int i6 = ksaVar.m;
                long j4 = (i6 + 1) * j3;
                long j5 = j4 - (ksaVar.n * j2);
                long j6 = j4 - (i6 * j3);
                ((short[]) this.f)[(ksaVar.k * i4) + i3] = (short) ((((j6 - j5) * s2) + (s * j5)) / j6);
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.jsa
    public void j(int i2) {
        this.f = r((short[]) this.f, ((ksa) this.h).k, i2);
    }

    @Override // defpackage.jsa
    public boolean k() {
        int i2 = this.a;
        if (i2 != 0 && ((ksa) this.h).p != 0 && this.b <= i2 * 3 && i2 * 2 > this.c * 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jsa
    public Object l() {
        return (short[]) this.g;
    }

    @Override // defpackage.jsa
    public void m(int i2, int i3, int i4, int i5, int i6) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i9] * i11) + ((i2 - i11) * sArr2[i10])) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    @Override // defpackage.jsa
    public void n(int i2) {
        this.g = r((short[]) this.g, ((ksa) this.h).l, i2);
    }

    @Override // defpackage.jsa
    public int o() {
        return 2;
    }

    @Override // defpackage.jsa
    public void p(int i2) {
        this.e = r((short[]) this.e, ((ksa) this.h).j, i2);
    }

    @Override // defpackage.jsa
    public int q(int i2, int i3) {
        return s((short[]) this.d, 0, i2, i3);
    }

    public short[] r(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = ((ksa) this.h).b;
        int i5 = length / i4;
        if (i2 + i3 <= i5) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    public int s(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * ((ksa) this.h).b;
        int i6 = 255;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i8 < i7 * i3) {
                i8 = i3;
                i7 = i10;
            }
            if (i10 * i6 > i9 * i3) {
                i6 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.a = i7 / i8;
        this.b = i9 / i6;
        return i8;
    }

    public tea(ksa ksaVar) {
        this.h = ksaVar;
        int i2 = ksaVar.h;
        this.d = new short[i2];
        int i3 = i2 * ksaVar.b;
        this.e = new short[i3];
        this.f = new short[i3];
        this.g = new short[i3];
    }
}
