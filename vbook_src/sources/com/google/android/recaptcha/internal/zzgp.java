package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        String i0;
        String str;
        if (zzueVarArr.length == 1) {
            int i2 = 0;
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                if (zza2 instanceof int[]) {
                    int[] iArr = (int[]) zza2;
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int length = iArr.length;
                    int i3 = 0;
                    while (i2 < length) {
                        int i4 = iArr[i2];
                        i3++;
                        if (i3 > 1) {
                            sb.append((CharSequence) ",");
                        }
                        sb.append((CharSequence) String.valueOf(i4));
                        i2++;
                    }
                    sb.append((CharSequence) "]");
                    i0 = sb.toString();
                } else {
                    if (zza2 instanceof byte[]) {
                        str = new String((byte[]) zza2, ed1.a);
                    } else if (zza2 instanceof long[]) {
                        long[] jArr = (long[]) zza2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((CharSequence) "[");
                        int length2 = jArr.length;
                        int i5 = 0;
                        while (i2 < length2) {
                            long j = jArr[i2];
                            i5++;
                            if (i5 > 1) {
                                sb2.append((CharSequence) ",");
                            }
                            sb2.append((CharSequence) String.valueOf(j));
                            i2++;
                        }
                        sb2.append((CharSequence) "]");
                        i0 = sb2.toString();
                    } else if (zza2 instanceof short[]) {
                        short[] sArr = (short[]) zza2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append((CharSequence) "[");
                        int length3 = sArr.length;
                        int i6 = 0;
                        while (i2 < length3) {
                            short s = sArr[i2];
                            i6++;
                            if (i6 > 1) {
                                sb3.append((CharSequence) ",");
                            }
                            sb3.append((CharSequence) String.valueOf((int) s));
                            i2++;
                        }
                        sb3.append((CharSequence) "]");
                        i0 = sb3.toString();
                    } else if (zza2 instanceof float[]) {
                        float[] fArr = (float[]) zza2;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append((CharSequence) "[");
                        int length4 = fArr.length;
                        int i7 = 0;
                        while (i2 < length4) {
                            float f = fArr[i2];
                            i7++;
                            if (i7 > 1) {
                                sb4.append((CharSequence) ",");
                            }
                            sb4.append((CharSequence) String.valueOf(f));
                            i2++;
                        }
                        sb4.append((CharSequence) "]");
                        i0 = sb4.toString();
                    } else if (zza2 instanceof double[]) {
                        double[] dArr = (double[]) zza2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append((CharSequence) "[");
                        int length5 = dArr.length;
                        int i8 = 0;
                        while (i2 < length5) {
                            double d = dArr[i2];
                            i8++;
                            if (i8 > 1) {
                                sb5.append((CharSequence) ",");
                            }
                            sb5.append((CharSequence) String.valueOf(d));
                            i2++;
                        }
                        sb5.append((CharSequence) "]");
                        i0 = sb5.toString();
                    } else if (zza2 instanceof char[]) {
                        str = new String((char[]) zza2);
                    } else if (zza2 instanceof Object[]) {
                        i0 = b00.s0((Object[]) zza2, ",", "[", "]", null, 56);
                    } else if (zza2 instanceof Collection) {
                        i0 = sl1.i0((Iterable) zza2, ",", "[", "]", null, 56);
                    } else {
                        hfd.f(4, 5, null);
                        return;
                    }
                    i0 = str;
                }
                zzgdVar.zzc().zze(i, i0);
                return;
            }
            hfd.f(4, 5, null);
            return;
        }
        hfd.f(4, 3, null);
    }
}
