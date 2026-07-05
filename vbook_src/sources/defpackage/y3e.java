package defpackage;

import com.google.ads.interactivemedia.v3.impl.data.AdsRenderingSettingsImpl;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y3e  reason: default package */
/* loaded from: classes.dex */
public final class y3e {
    public static final o3e b = new o3e(new Supplier() { // from class: w3e
        @Override // java.util.function.Supplier
        public final /* synthetic */ Object get() {
            return new HashSet();
        }
    });
    public int a = 17;

    public static void b(AdsRenderingSettingsImpl adsRenderingSettingsImpl, Class cls, y3e y3eVar, String[] strArr) {
        o3e o3eVar = b;
        Set set = (Set) o3eVar.get();
        if (set == null || !set.contains(new d4e(adsRenderingSettingsImpl))) {
            try {
                ((Set) o3eVar.get()).add(new d4e(adsRenderingSettingsImpl));
                Field[] declaredFields = cls.getDeclaredFields();
                Comparator comparing = Comparator.comparing(new Function() { // from class: u3e
                    @Override // java.util.function.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        return ((Field) obj).getName();
                    }
                });
                if (declaredFields != null) {
                    Arrays.sort(declaredFields, comparing);
                }
                AccessibleObject.setAccessible(declaredFields, true);
                for (Field field : declaredFields) {
                    if (!hc2.w(field.getName(), strArr) && !field.getName().contains("$") && !Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(b4e.class)) {
                        y3eVar.a(nc2.q(field, adsRenderingSettingsImpl));
                    }
                }
                Set set2 = (Set) o3eVar.get();
                set2.remove(new d4e(adsRenderingSettingsImpl));
                if (set2.isEmpty()) {
                    o3eVar.remove();
                }
            } catch (Throwable th) {
                Set set3 = (Set) o3eVar.get();
                set3.remove(new d4e(adsRenderingSettingsImpl));
                if (set3.isEmpty()) {
                    o3eVar.remove();
                }
                throw th;
            }
        }
    }

    public final void a(Object obj) {
        if (obj == null) {
            this.a *= 37;
        } else if (obj.getClass().isArray()) {
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length = jArr.length;
                while (i < length) {
                    long j = jArr[i];
                    this.a = (this.a * 37) + ((int) (j ^ (j >> 32)));
                    i++;
                }
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length2 = iArr.length;
                while (i < length2) {
                    this.a = (this.a * 37) + iArr[i];
                    i++;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length3 = sArr.length;
                while (i < length3) {
                    this.a = (this.a * 37) + sArr[i];
                    i++;
                }
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length4 = cArr.length;
                while (i < length4) {
                    this.a = (this.a * 37) + cArr[i];
                    i++;
                }
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length5 = bArr.length;
                while (i < length5) {
                    this.a = (this.a * 37) + bArr[i];
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                while (i < length6) {
                    long doubleToLongBits = Double.doubleToLongBits(dArr[i]);
                    this.a = (this.a * 37) + ((int) (doubleToLongBits ^ (doubleToLongBits >> 32)));
                    i++;
                }
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length7 = fArr.length;
                while (i < length7) {
                    this.a = Float.floatToIntBits(fArr[i]) + (this.a * 37);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length8 = zArr.length;
                while (i < length8) {
                    this.a = (this.a * 37) + (!zArr[i] ? 1 : 0);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length9 = objArr.length;
                while (i < length9) {
                    a(objArr[i]);
                    i++;
                }
            }
        } else {
            this.a = obj.hashCode() + (this.a * 37);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof y3e) && this.a == ((y3e) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
