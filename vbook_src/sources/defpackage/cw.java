package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cw  reason: default package */
/* loaded from: classes.dex */
public final class cw implements gg2 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public cw(int i, byte b) {
        this.a = i;
        switch (i) {
            case 3:
                return;
            case 6:
                this.d = new long[10];
                this.e = new Object[10];
                return;
            default:
                this.d = new kw5(28);
                this.b = 8000;
                this.c = 8000;
                return;
        }
    }

    public synchronized void a(Object obj, long j) {
        int i = this.c;
        if (i > 0) {
            if (j <= ((long[]) this.d)[((this.b + i) - 1) % ((Object[]) this.e).length]) {
                c();
            }
        }
        d();
        int i2 = this.b;
        int i3 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i3 + 1;
    }

    public void b(int i) {
        new Handler(Looper.getMainLooper()).post(new jb(this, i));
    }

    public synchronized void c() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public void d() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public int e() {
        mv4 mv4Var = (mv4) this.e;
        String str = (String) this.d;
        if (mv4Var == null) {
            return str.length();
        }
        return (mv4Var.b - mv4Var.a()) + (str.length() - (this.c - this.b));
    }

    public void f(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
            if ((this.c & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = gw.a(typeface, i, z);
        }
        hw hwVar = (hw) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (hwVar.m) {
            hwVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = hwVar.j;
                if (isAttachedToWindow) {
                    textView.post(new dw(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public Object g(boolean z, long j) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = k();
            j2 = j3;
        }
        return obj;
    }

    @Override // defpackage.gg2
    public jg2 h() {
        return new ku2((String) this.e, this.b, this.c, (kw5) this.d);
    }

    public synchronized Object i() {
        Object k;
        if (this.c == 0) {
            k = null;
        } else {
            k = k();
        }
        return k;
    }

    public synchronized Object j(long j) {
        return g(true, j);
    }

    public Object k() {
        boolean z;
        if (this.c > 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public void l(int i, int i2, String str) {
        if (i > i2) {
            mv5.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            mv5.a("start must be non-negative, but was " + i);
        }
        mv4 mv4Var = (mv4) this.e;
        if (mv4Var == null) {
            int max = Math.max(255, str.length() + Token.CASE);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            mv4 mv4Var2 = new mv4(0);
            mv4Var2.b = max;
            mv4Var2.c = cArr;
            mv4Var2.d = str.length() + min;
            mv4Var2.e = i4;
            this.e = mv4Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= mv4Var.b - mv4Var.a()) {
            int length = str.length() - (i8 - i7);
            if (length > mv4Var.a()) {
                int a = length - mv4Var.a();
                int i9 = mv4Var.b;
                do {
                    i9 *= 2;
                } while (i9 - mv4Var.b < a);
                char[] cArr2 = new char[i9];
                b00.X(mv4Var.c, cArr2, 0, 0, mv4Var.d);
                int i10 = mv4Var.b;
                int i11 = mv4Var.e;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                b00.X(mv4Var.c, cArr2, i13, i11, i12 + i11);
                mv4Var.c = cArr2;
                mv4Var.b = i9;
                mv4Var.e = i13;
            }
            int i14 = mv4Var.d;
            if (i7 < i14 && i8 <= i14) {
                int i15 = i14 - i8;
                char[] cArr3 = mv4Var.c;
                b00.X(cArr3, cArr3, mv4Var.e - i15, i8, i14);
                mv4Var.d = i7;
                mv4Var.e -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                mv4Var.e = mv4Var.a() + i8;
                mv4Var.d = i7;
            } else {
                int a2 = mv4Var.a() + i7;
                int a3 = mv4Var.a() + i8;
                int i16 = mv4Var.e;
                char[] cArr4 = mv4Var.c;
                b00.X(cArr4, cArr4, mv4Var.d, i16, a2);
                mv4Var.d += a2 - i16;
                mv4Var.e = a3;
            }
            str.getChars(0, str.length(), mv4Var.c, mv4Var.d);
            mv4Var.d = str.length() + mv4Var.d;
            return;
        }
        this.d = toString();
        this.e = null;
        this.b = -1;
        this.c = -1;
        l(i, i2, str);
    }

    public void m(Map map) {
        kw5 kw5Var = (kw5) this.d;
        synchronized (kw5Var) {
            kw5Var.c = null;
            ((HashMap) kw5Var.b).clear();
            ((HashMap) kw5Var.b).putAll(map);
        }
    }

    public synchronized int n() {
        return this.c;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                mv4 mv4Var = (mv4) this.e;
                String str = (String) this.d;
                if (mv4Var != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, this.b);
                    sb.append(mv4Var.c, 0, mv4Var.d);
                    char[] cArr = mv4Var.c;
                    int i = mv4Var.e;
                    sb.append(cArr, i, mv4Var.b - i);
                    String str2 = (String) this.d;
                    sb.append((CharSequence) str2, this.c, str2.length());
                    return sb.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public cw(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = 4;
        this.b = i;
        wq9.s(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public cw(cw cwVar) {
        this.a = 5;
        float[] fArr = (float[]) cwVar.d;
        this.b = fArr.length / 3;
        this.d = xoe.i(fArr);
        this.e = xoe.i((float[]) cwVar.e);
        int i = cwVar.c;
        if (i == 1) {
            this.c = 5;
        } else if (i != 2) {
            this.c = 4;
        } else {
            this.c = 6;
        }
    }

    public cw(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        this.a = 7;
        this.d = arrayList;
        this.e = arrayList2;
        this.b = i;
        this.c = i2;
    }

    public cw(hw hwVar, int i, int i2, WeakReference weakReference) {
        this.a = 0;
        this.e = hwVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }

    public cw(int i) {
        this.a = 1;
        this.d = new yic[i];
        this.c = 0;
    }
}
