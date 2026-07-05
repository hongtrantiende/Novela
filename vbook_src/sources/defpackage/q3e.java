package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q3e  reason: default package */
/* loaded from: classes.dex */
public final class q3e {
    public static final o3e d = new o3e(new Supplier() { // from class: n3e
        @Override // java.util.function.Supplier
        public final /* synthetic */ Object get() {
            return new HashSet();
        }
    });
    public boolean a = true;
    public final ArrayList b;
    public String[] c;

    public q3e() {
        ArrayList arrayList = new ArrayList(1);
        this.b = arrayList;
        arrayList.add(String.class);
    }

    public final void a(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (this.a && obj != obj2) {
            if (obj != null && obj2 != null) {
                if (obj.getClass().isArray()) {
                    if (obj.getClass() != obj2.getClass()) {
                        this.a = false;
                        return;
                    } else if (obj instanceof long[]) {
                        long[] jArr = (long[]) obj;
                        long[] jArr2 = (long[]) obj2;
                        if (this.a && jArr != jArr2) {
                            if (jArr.length != jArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i = 0; i < jArr.length && (z14 = this.a); i++) {
                                long j = jArr[i];
                                long j2 = jArr2[i];
                                if (z14) {
                                    if (j == j2) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    this.a = z15;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int[] iArr2 = (int[]) obj2;
                        if (this.a && iArr != iArr2) {
                            if (iArr.length != iArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i2 = 0; i2 < iArr.length && (z12 = this.a); i2++) {
                                int i3 = iArr[i2];
                                int i4 = iArr2[i2];
                                if (z12) {
                                    if (i3 == i4) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    this.a = z13;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        short[] sArr2 = (short[]) obj2;
                        if (this.a && sArr != sArr2) {
                            if (sArr.length != sArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i5 = 0; i5 < sArr.length && (z10 = this.a); i5++) {
                                short s = sArr[i5];
                                short s2 = sArr2[i5];
                                if (z10) {
                                    if (s == s2) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    this.a = z11;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        char[] cArr2 = (char[]) obj2;
                        if (this.a && cArr != cArr2) {
                            if (cArr.length != cArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i6 = 0; i6 < cArr.length && (z8 = this.a); i6++) {
                                char c = cArr[i6];
                                char c2 = cArr2[i6];
                                if (z8) {
                                    if (c == c2) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    this.a = z9;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        byte[] bArr2 = (byte[]) obj2;
                        if (this.a && bArr != bArr2) {
                            if (bArr.length != bArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i7 = 0; i7 < bArr.length && (z6 = this.a); i7++) {
                                byte b = bArr[i7];
                                byte b2 = bArr2[i7];
                                if (z6) {
                                    if (b == b2) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    this.a = z7;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof double[]) {
                        double[] dArr = (double[]) obj;
                        double[] dArr2 = (double[]) obj2;
                        if (this.a && dArr != dArr2) {
                            if (dArr.length != dArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i8 = 0; i8 < dArr.length && (z4 = this.a); i8++) {
                                double d2 = dArr[i8];
                                double d3 = dArr2[i8];
                                if (z4) {
                                    long doubleToLongBits = Double.doubleToLongBits(d2);
                                    long doubleToLongBits2 = Double.doubleToLongBits(d3);
                                    if (this.a) {
                                        if (doubleToLongBits == doubleToLongBits2) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        this.a = z5;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        float[] fArr2 = (float[]) obj2;
                        if (this.a && fArr != fArr2) {
                            if (fArr.length != fArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i9 = 0; i9 < fArr.length && (z2 = this.a); i9++) {
                                float f = fArr[i9];
                                float f2 = fArr2[i9];
                                if (z2) {
                                    int floatToIntBits = Float.floatToIntBits(f);
                                    int floatToIntBits2 = Float.floatToIntBits(f2);
                                    if (this.a) {
                                        if (floatToIntBits == floatToIntBits2) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        this.a = z3;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } else if (obj instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj;
                        boolean[] zArr2 = (boolean[]) obj2;
                        if (this.a && zArr != zArr2) {
                            if (zArr.length != zArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i10 = 0; i10 < zArr.length && this.a; i10++) {
                                if (zArr[i10] == zArr2[i10]) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                this.a = z;
                            }
                            return;
                        }
                        return;
                    } else {
                        Object[] objArr = (Object[]) obj;
                        Object[] objArr2 = (Object[]) obj2;
                        if (this.a && objArr != objArr2) {
                            if (objArr.length != objArr2.length) {
                                this.a = false;
                                return;
                            }
                            for (int i11 = 0; i11 < objArr.length && this.a; i11++) {
                                a(objArr[i11], objArr2[i11]);
                            }
                            return;
                        }
                        return;
                    }
                }
                this.a = obj.equals(obj2);
                return;
            }
            this.a = false;
        }
    }

    public final void b(AdsRenderingSettingsImpl adsRenderingSettingsImpl, Object obj, Class cls) {
        l4e l4eVar;
        o3e o3eVar = d;
        Set set = (Set) o3eVar.get();
        l4e l4eVar2 = new l4e(new d4e(adsRenderingSettingsImpl), new d4e(obj));
        d4e d4eVar = (d4e) l4eVar2.b;
        d4e d4eVar2 = (d4e) l4eVar2.a;
        if (d4eVar == null && d4eVar2 == null) {
            l4eVar = l4e.c;
        } else {
            l4eVar = new l4e(d4eVar, d4eVar2);
        }
        if (set == null || (!set.contains(l4eVar2) && !set.contains(l4eVar))) {
            try {
                ((Set) o3eVar.get()).add(new l4e(new d4e(adsRenderingSettingsImpl), new d4e(obj)));
                Field[] declaredFields = cls.getDeclaredFields();
                AccessibleObject.setAccessible(declaredFields, true);
                for (int i = 0; i < declaredFields.length && this.a; i++) {
                    Field field = declaredFields[i];
                    if (!hc2.w(field.getName(), this.c) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(s3e.class)) {
                        a(nc2.q(field, adsRenderingSettingsImpl), nc2.q(field, obj));
                    }
                }
            } finally {
                Set set2 = (Set) o3eVar.get();
                set2.remove(new l4e(new d4e(adsRenderingSettingsImpl), new d4e(obj)));
                if (set2.isEmpty()) {
                    o3eVar.remove();
                }
            }
        }
    }
}
