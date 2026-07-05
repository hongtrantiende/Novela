package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzol<T> implements zzow<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzps.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzoi zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzpl zzm;
    private final zzmp zzn;

    private zzol(int[] iArr, Object[] objArr, int i, int i2, zzoi zzoiVar, boolean z, int[] iArr2, int i3, int i4, zzoo zzooVar, zznv zznvVar, zzpl zzplVar, zzmp zzmpVar, zzod zzodVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzoiVar instanceof zznd;
        boolean z2 = false;
        if (zzmpVar != null && (zzoiVar instanceof zzna)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzplVar;
        this.zzn = zzmpVar;
        this.zzg = zzoiVar;
    }

    private final Object zzA(Object obj, int i) {
        zzow zzx = zzx(i);
        int zzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzow zzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder y = nk2.y("Field ", str, " for ", name, " not found. Known fields are ");
            y.append(arrays);
            throw new RuntimeException(y.toString());
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
            return;
        }
        vs.m("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (!zzN(obj2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzow zzx = zzx(i);
            if (!zzN(obj, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        vs.k(hl5.m("Source subfield ", " is present but null: ", this.zzc[i], obj2.toString()));
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (!zzR(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = zzb;
        long zzu = zzu(i) & 1048575;
        Object object = unsafe.getObject(obj2, zzu);
        if (object != null) {
            zzow zzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, zzu, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, zzu, zze);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzu);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, zzu, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        vs.k(hl5.m("Source subfield ", " is present but null: ", this.zzc[i], obj2.toString()));
    }

    private final void zzG(Object obj, int i, zzov zzovVar) {
        long j = i & 1048575;
        if (zzM(i)) {
            zzps.zzs(obj, j, zzovVar.zzs());
        } else if (this.zzi) {
            zzps.zzs(obj, j, zzovVar.zzr());
        } else {
            zzps.zzs(obj, j, zzovVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int zzr = zzr(i);
        long j = 1048575 & zzr;
        if (j == 1048575) {
            return;
        }
        zzps.zzq(obj, j, (1 << (zzr >>> 20)) | zzps.zzc(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzps.zzq(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        if (zzN(obj, i) == zzN(obj2, i)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private final boolean zzN(Object obj, int i) {
        int zzr = zzr(i);
        long j = zzr & 1048575;
        if (j == 1048575) {
            int zzu = zzu(i);
            long j2 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzps.zza(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzps.zzb(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzps.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzps.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzps.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzps.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzps.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzps.zzw(obj, j2);
                case 8:
                    Object zzf = zzps.zzf(obj, j2);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (zzf instanceof zzle) {
                        if (zzle.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    } else {
                        p1a.g();
                        return false;
                    }
                case 9:
                    if (zzps.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzle.zzb.equals(zzps.zzf(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzps.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzps.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzps.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzps.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzps.zzc(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzps.zzd(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzps.zzf(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    p1a.g();
                    return false;
            }
        } else if (((1 << (zzr >>> 20)) & zzps.zzc(obj, j)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i, zzow zzowVar) {
        return zzowVar.zzl(zzps.zzf(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zznd) {
            return ((zznd) obj).zzL();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        if (zzps.zzc(obj, zzr(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzps.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzpy zzpyVar) {
        if (obj instanceof String) {
            zzpyVar.zzG(i, (String) obj);
        } else {
            zzpyVar.zzd(i, (zzle) obj);
        }
    }

    public static zzpm zzd(Object obj) {
        zznd zzndVar = (zznd) obj;
        zzpm zzpmVar = zzndVar.zzc;
        if (zzpmVar == zzpm.zzc()) {
            zzpm zzf = zzpm.zzf();
            zzndVar.zzc = zzf;
            return zzf;
        }
        return zzpmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.recaptcha.internal.zzol zzm(java.lang.Class r31, com.google.android.recaptcha.internal.zzof r32, com.google.android.recaptcha.internal.zzoo r33, com.google.android.recaptcha.internal.zznv r34, com.google.android.recaptcha.internal.zzpl r35, com.google.android.recaptcha.internal.zzmp r36, com.google.android.recaptcha.internal.zzod r37) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzof, com.google.android.recaptcha.internal.zzoo, com.google.android.recaptcha.internal.zznv, com.google.android.recaptcha.internal.zzpl, com.google.android.recaptcha.internal.zzmp, com.google.android.recaptcha.internal.zzod):com.google.android.recaptcha.internal.zzol");
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzps.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzps.zzf(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzps.zzf(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i >= this.zze && i <= this.zzf) {
            return zzs(i, 0);
        }
        return -1;
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzps.zzf(obj, j)).longValue();
    }

    private final zznh zzw(int i) {
        int i2 = i / 3;
        return (zznh) this.zzd[i2 + i2 + 1];
    }

    private final zzow zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzow zzowVar = (zzow) objArr[i3];
        if (zzowVar != null) {
            return zzowVar;
        }
        zzow zzb2 = zzos.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzpl zzplVar, Object obj3) {
        int i2 = this.zzc[i];
        Object zzf = zzps.zzf(obj, zzu(i) & 1048575);
        if (zzf == null || zzw(i) == null) {
            return obj2;
        }
        zzoc zzocVar = (zzoc) zzf;
        zzob zzobVar = (zzob) zzz(i);
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.recaptcha.internal.zzow
    public final int zza(Object obj) {
        int i;
        int zzA;
        int zzB;
        int zzA2;
        int zzd;
        int zzA3;
        int zzh;
        int zzA4;
        int size;
        int zzl;
        int zzA5;
        int zzd2;
        boolean z;
        int zzb2;
        int i2;
        int zzA6;
        int zzA7;
        int size2;
        int zzk;
        int zzA8;
        int size3;
        int zzi;
        int zzA9;
        int i3;
        int zze;
        int zzA10;
        int zzA11;
        int zzA12;
        int zzB2;
        zzol<T> zzolVar = this;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < zzolVar.zzc.length) {
            int zzu = zzolVar.zzu(i6);
            int zzt = zzt(zzu);
            int[] iArr = zzolVar.zzc;
            int i9 = iArr[i6];
            int i10 = iArr[i6 + 2];
            int i11 = i10 & i4;
            if (zzt <= 17) {
                if (i11 != i5) {
                    if (i11 == i4) {
                        i7 = 0;
                    } else {
                        i7 = unsafe.getInt(obj2, i11);
                    }
                    i5 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = zzu & i4;
            if (zzt >= zzmu.zzJ.zza()) {
                zzmu.zzW.zza();
            }
            long j = i12;
            switch (zzt) {
                case 0:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 8, i8);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 4, i8);
                    }
                    zzolVar = this;
                    break;
                case 2:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j2);
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    break;
                case 3:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j3 = unsafe.getLong(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(j3);
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    break;
                case 4:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(unsafe.getInt(obj2, j));
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    break;
                case 5:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 8, i8);
                    }
                    zzolVar = this;
                    break;
                case 6:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 4, i8);
                    }
                    zzolVar = this;
                    break;
                case 7:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 1, i8);
                    }
                    zzolVar = this;
                    break;
                case 8:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(obj2, j);
                        if (object instanceof zzle) {
                            zzA2 = zzln.zzA(i13);
                            zzd = ((zzle) object).zzd();
                            zzA3 = zzln.zzA(zzd);
                            i8 += zzA3 + zzd + zzA2;
                        } else {
                            zzA = zzln.zzA(i13);
                            zzB = zzln.zzz((String) object);
                            i8 += zzB + zzA;
                        }
                    }
                    zzolVar = this;
                    break;
                case 9:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        zzh = zzoy.zzh(i9, unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                        i8 += zzh;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        zzA2 = zzln.zzA(i9 << 3);
                        zzd = ((zzle) unsafe.getObject(obj2, j)).zzd();
                        zzA3 = zzln.zzA(zzd);
                        i8 += zzA3 + zzd + zzA2;
                    }
                    zzolVar = this;
                    break;
                case 11:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(unsafe.getInt(obj2, j), zzln.zzA(i9 << 3), i8);
                    }
                    zzolVar = this;
                    break;
                case 12:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB(unsafe.getInt(obj2, j));
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    break;
                case 13:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 4, i8);
                    }
                    zzolVar = this;
                    break;
                case 14:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 = eub.z(i9 << 3, 8, i8);
                    }
                    zzolVar = this;
                    break;
                case 15:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        int i14 = unsafe.getInt(obj2, j);
                        i8 = eub.z((i14 >> 31) ^ (i14 + i14), zzln.zzA(i9 << 3), i8);
                    }
                    zzolVar = this;
                    break;
                case 16:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        long j4 = unsafe.getLong(obj2, j);
                        zzA = zzln.zzA(i9 << 3);
                        zzB = zzln.zzB((j4 >> 63) ^ (j4 + j4));
                        i8 += zzB + zzA;
                    }
                    zzolVar = this;
                    break;
                case 17:
                    if (zzolVar.zzO(obj2, i6, i5, i7, i)) {
                        i8 += zzln.zzw(i9, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzh = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzh;
                    break;
                case 19:
                    zzh = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzh;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj2, j);
                    int i15 = zzoy.zza;
                    if (list.size() != 0) {
                        zzA4 = (zzln.zzA(i9 << 3) * list.size()) + zzoy.zzg(list);
                        i8 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i8 += zzA4;
                case 21:
                    List list2 = (List) unsafe.getObject(obj2, j);
                    int i16 = zzoy.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzoy.zzl(list2);
                        zzA5 = zzln.zzA(i9 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i8 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i8 += zzA4;
                case 22:
                    List list3 = (List) unsafe.getObject(obj2, j);
                    int i17 = zzoy.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzoy.zzf(list3);
                        zzA5 = zzln.zzA(i9 << 3);
                        zzA4 = (zzA5 * size) + zzl;
                        i8 += zzA4;
                        break;
                    }
                    zzA4 = 0;
                    i8 += zzA4;
                case 23:
                    zzd2 = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzd2;
                    break;
                case 24:
                    z = false;
                    zzb2 = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzb2;
                    break;
                case 25:
                    int i18 = zzoy.zza;
                    int size4 = ((List) unsafe.getObject(obj2, j)).size();
                    if (size4 != 0) {
                        zzd2 = size4 * (zzln.zzA(i9 << 3) + 1);
                        i8 += zzd2;
                        break;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                case 26:
                    List list4 = (List) unsafe.getObject(obj2, j);
                    int i19 = zzoy.zza;
                    int size5 = list4.size();
                    if (size5 == 0) {
                        i2 = 0;
                    } else {
                        int zzA13 = zzln.zzA(i9 << 3) * size5;
                        if (list4 instanceof zznu) {
                            zznu zznuVar = (zznu) list4;
                            i2 = zzA13;
                            for (int i20 = 0; i20 < size5; i20++) {
                                Object zzc = zznuVar.zzc();
                                if (zzc instanceof zzle) {
                                    int zzd3 = ((zzle) zzc).zzd();
                                    i2 = eub.z(zzd3, zzd3, i2);
                                } else {
                                    i2 = zzln.zzz((String) zzc) + i2;
                                }
                            }
                        } else {
                            i2 = zzA13;
                            for (int i21 = 0; i21 < size5; i21++) {
                                Object obj3 = list4.get(i21);
                                if (obj3 instanceof zzle) {
                                    int zzd4 = ((zzle) obj3).zzd();
                                    i2 = eub.z(zzd4, zzd4, i2);
                                } else {
                                    i2 = zzln.zzz((String) obj3) + i2;
                                }
                            }
                        }
                    }
                    i8 += i2;
                    break;
                case 27:
                    List list5 = (List) unsafe.getObject(obj2, j);
                    zzow zzx = zzolVar.zzx(i6);
                    int i22 = zzoy.zza;
                    int size6 = list5.size();
                    if (size6 == 0) {
                        zzA6 = 0;
                    } else {
                        zzA6 = zzln.zzA(i9 << 3) * size6;
                        for (int i23 = 0; i23 < size6; i23++) {
                            Object obj4 = list5.get(i23);
                            if (obj4 instanceof zznt) {
                                int zza2 = ((zznt) obj4).zza();
                                zzA6 = eub.z(zza2, zza2, zzA6);
                            } else {
                                zzA6 = zzln.zzy((zzoi) obj4, zzx) + zzA6;
                            }
                        }
                    }
                    i8 += zzA6;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(obj2, j);
                    int i24 = zzoy.zza;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        zzA7 = 0;
                    } else {
                        zzA7 = zzln.zzA(i9 << 3) * size7;
                        for (int i25 = 0; i25 < list6.size(); i25++) {
                            int zzd5 = ((zzle) list6.get(i25)).zzd();
                            zzA7 = eub.z(zzd5, zzd5, zzA7);
                        }
                    }
                    i8 += zzA7;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(obj2, j);
                    int i26 = zzoy.zza;
                    size2 = list7.size();
                    if (size2 != 0) {
                        zzk = zzoy.zzk(list7);
                        zzA8 = zzln.zzA(i9 << 3);
                        zzd2 = zzk + (zzA8 * size2);
                        i8 += zzd2;
                        break;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                case 30:
                    List list8 = (List) unsafe.getObject(obj2, j);
                    int i27 = zzoy.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zzoy.zza(list8);
                        zzA8 = zzln.zzA(i9 << 3);
                        zzd2 = zzk + (zzA8 * size2);
                        i8 += zzd2;
                        break;
                    }
                    zzd2 = 0;
                    i8 += zzd2;
                case 31:
                    zzd2 = zzoy.zzb(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzd2;
                    break;
                case 32:
                    z = false;
                    zzb2 = zzoy.zzd(i9, (List) unsafe.getObject(obj2, j), false);
                    i8 += zzb2;
                    break;
                case Token.GETPROP /* 33 */:
                    List list9 = (List) unsafe.getObject(obj2, j);
                    int i28 = zzoy.zza;
                    size3 = list9.size();
                    if (size3 != 0) {
                        zzi = zzoy.zzi(list9);
                        zzA9 = zzln.zzA(i9 << 3);
                        i3 = (zzA9 * size3) + zzi;
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case Token.GETPROPNOWARN /* 34 */:
                    List list10 = (List) unsafe.getObject(obj2, j);
                    int i29 = zzoy.zza;
                    size3 = list10.size();
                    if (size3 != 0) {
                        zzi = zzoy.zzj(list10);
                        zzA9 = zzln.zzA(i9 << 3);
                        i3 = (zzA9 * size3) + zzi;
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case Token.GETPROP_SUPER /* 35 */:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.SETPROP /* 37 */:
                    zze = zzoy.zzg((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    zze = zzoy.zzl((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.GETELEM /* 39 */:
                    zze = zzoy.zzf((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.GETELEM_SUPER /* 40 */:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.SETELEM /* 41 */:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.SETELEM_SUPER /* 42 */:
                    int i30 = zzoy.zza;
                    zze = ((List) unsafe.getObject(obj2, j)).size();
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.CALL /* 43 */:
                    zze = zzoy.zzk((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.NAME /* 44 */:
                    zze = zzoy.zza((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.NUMBER /* 45 */:
                    zze = zzoy.zzc((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.STRING /* 46 */:
                    zze = zzoy.zze((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.NULL /* 47 */:
                    zze = zzoy.zzi((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.THIS /* 48 */:
                    zze = zzoy.zzj((List) unsafe.getObject(obj2, j));
                    if (zze > 0) {
                        zzA10 = zzln.zzA(i9 << 3);
                        zzA11 = zzln.zzA(zze);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.FALSE /* 49 */:
                    List list11 = (List) unsafe.getObject(obj2, j);
                    zzow zzx2 = zzolVar.zzx(i6);
                    int i31 = zzoy.zza;
                    int size8 = list11.size();
                    if (size8 != 0) {
                        int i32 = 0;
                        for (int i33 = 0; i33 < size8; i33++) {
                            i32 += zzln.zzw(i9, (zzoi) list11.get(i33), zzx2);
                        }
                        i3 = i32;
                        i8 += i3;
                        break;
                    }
                    i3 = 0;
                    i8 += i3;
                case Token.TRUE /* 50 */:
                    zzoc zzocVar = (zzoc) unsafe.getObject(obj2, j);
                    zzob zzobVar = (zzob) zzolVar.zzz(i6);
                    if (!zzocVar.isEmpty()) {
                        Iterator it = zzocVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    break;
                case Token.SHEQ /* 51 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 8, i8);
                    }
                    break;
                case Token.SHNE /* 52 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 4, i8);
                    }
                    break;
                case Token.REGEXP /* 53 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzv = zzv(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzv);
                        i8 += zzB2 + zzA12;
                    }
                    break;
                case Token.BINDNAME /* 54 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzv2 = zzv(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzv2);
                        i8 += zzB2 + zzA12;
                    }
                    break;
                case Token.THROW /* 55 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzp(obj2, j));
                        i8 += zzB2 + zzA12;
                    }
                    break;
                case Token.RETHROW /* 56 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 8, i8);
                    }
                    break;
                case Token.IN /* 57 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 4, i8);
                    }
                    break;
                case Token.INSTANCEOF /* 58 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 1, i8);
                    }
                    break;
                case Token.LOCAL_LOAD /* 59 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        int i34 = i9 << 3;
                        Object object2 = unsafe.getObject(obj2, j);
                        if (object2 instanceof zzle) {
                            zze = zzln.zzA(i34);
                            zzA10 = ((zzle) object2).zzd();
                            zzA11 = zzln.zzA(zzA10);
                            i8 += zzA11 + zzA10 + zze;
                        } else {
                            zzA12 = zzln.zzA(i34);
                            zzB2 = zzln.zzz((String) object2);
                            i8 += zzB2 + zzA12;
                        }
                    }
                    break;
                case Token.GETVAR /* 60 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        zzd2 = zzoy.zzh(i9, unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                        i8 += zzd2;
                    }
                    break;
                case Token.SETVAR /* 61 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        zze = zzln.zzA(i9 << 3);
                        zzA10 = ((zzle) unsafe.getObject(obj2, j)).zzd();
                        zzA11 = zzln.zzA(zzA10);
                        i8 += zzA11 + zzA10 + zze;
                    }
                    break;
                case Token.CATCH_SCOPE /* 62 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(zzp(obj2, j), zzln.zzA(i9 << 3), i8);
                    }
                    break;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB(zzp(obj2, j));
                        i8 += zzB2 + zzA12;
                    }
                    break;
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 4, i8);
                    }
                    break;
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 = eub.z(i9 << 3, 8, i8);
                    }
                    break;
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        int zzp = zzp(obj2, j);
                        i8 = eub.z((zzp >> 31) ^ (zzp + zzp), zzln.zzA(i9 << 3), i8);
                    }
                    break;
                case Token.ENUM_NEXT /* 67 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        long zzv3 = zzv(obj2, j);
                        zzA12 = zzln.zzA(i9 << 3);
                        zzB2 = zzln.zzB((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i8 += zzB2 + zzA12;
                    }
                    break;
                case Token.ENUM_ID /* 68 */:
                    if (zzolVar.zzR(obj2, i9, i6)) {
                        i8 += zzln.zzw(i9, (zzoi) unsafe.getObject(obj2, j), zzolVar.zzx(i6));
                    }
                    break;
            }
            i6 += 3;
            obj2 = obj;
            i4 = 1048575;
        }
        int i35 = 0;
        int zza3 = ((zznd) obj).zzc.zza() + i8;
        if (zzolVar.zzh) {
            zzmt zzmtVar = ((zzna) obj).zzb;
            int zzc2 = zzmtVar.zza.zzc();
            int i36 = 0;
            while (true) {
                zzpe zzpeVar = zzmtVar.zza;
                if (i36 < zzc2) {
                    Map.Entry zzg = zzpeVar.zzg(i36);
                    i35 += zzmt.zza((zzms) ((zzpa) zzg).zza(), zzg.getValue());
                    i36++;
                } else {
                    for (Map.Entry entry2 : zzpeVar.zzd()) {
                        i35 += zzmt.zza((zzms) entry2.getKey(), entry2.getValue());
                    }
                    return zza3 + i35;
                }
            }
        } else {
            return zza3;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int zzc;
        int i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.zzc.length; i5 += 3) {
            int zzu = zzu(i5);
            int[] iArr = this.zzc;
            int i6 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i7 = iArr[i5];
            long j = i6;
            int i8 = 37;
            switch (zzt) {
                case 0:
                    i = i4 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzps.zza(obj, j));
                    byte[] bArr = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 1:
                    i2 = i4 * 53;
                    floatToIntBits = Float.floatToIntBits(zzps.zzb(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr2 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 3:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr3 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 4:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 5:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr4 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 6:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    floatToIntBits = zznl.zza(zzps.zzw(obj, j));
                    i4 = floatToIntBits + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 9:
                    i3 = i4 * 53;
                    Object zzf = zzps.zzf(obj, j);
                    if (zzf != null) {
                        i8 = zzf.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 10:
                    i2 = i4 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case 11:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 12:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 13:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 14:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr5 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 15:
                    i = i4 * 53;
                    zzc = zzps.zzc(obj, j);
                    i4 = i + zzc;
                    break;
                case 16:
                    i = i4 * 53;
                    doubleToLongBits = zzps.zzd(obj, j);
                    byte[] bArr6 = zznl.zzb;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i4 = i + zzc;
                    break;
                case 17:
                    i3 = i4 * 53;
                    Object zzf2 = zzps.zzf(obj, j);
                    if (zzf2 != null) {
                        i8 = zzf2.hashCode();
                    }
                    i4 = i3 + i8;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Token.GETPROP /* 33 */:
                case Token.GETPROPNOWARN /* 34 */:
                case Token.GETPROP_SUPER /* 35 */:
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                case Token.SETPROP /* 37 */:
                case Token.SETPROP_SUPER /* 38 */:
                case Token.GETELEM /* 39 */:
                case Token.GETELEM_SUPER /* 40 */:
                case Token.SETELEM /* 41 */:
                case Token.SETELEM_SUPER /* 42 */:
                case Token.CALL /* 43 */:
                case Token.NAME /* 44 */:
                case Token.NUMBER /* 45 */:
                case Token.STRING /* 46 */:
                case Token.NULL /* 47 */:
                case Token.THIS /* 48 */:
                case Token.FALSE /* 49 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case Token.TRUE /* 50 */:
                    i2 = i4 * 53;
                    floatToIntBits = zzps.zzf(obj, j).hashCode();
                    i4 = floatToIntBits + i2;
                    break;
                case Token.SHEQ /* 51 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.SHNE /* 52 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case Token.REGEXP /* 53 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.BINDNAME /* 54 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.THROW /* 55 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.RETHROW /* 56 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.IN /* 57 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.INSTANCEOF /* 58 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zznl.zza(zzS(obj, j));
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case Token.LOCAL_LOAD /* 59 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = ((String) zzps.zzf(obj, j)).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case Token.GETVAR /* 60 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case Token.SETVAR /* 61 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
                case Token.CATCH_SCOPE /* 62 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_INIT_VALUES /* 64 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_INIT_ARRAY /* 65 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        zzc = zzp(obj, j);
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_NEXT /* 67 */:
                    if (zzR(obj, i7, i5)) {
                        i = i4 * 53;
                        doubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zznl.zzb;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i4 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_ID /* 68 */:
                    if (zzR(obj, i7, i5)) {
                        i2 = i4 * 53;
                        floatToIntBits = zzps.zzf(obj, j).hashCode();
                        i4 = floatToIntBits + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zznd) obj).zzc.hashCode() + (i4 * 53);
        if (this.zzh) {
            return (hashCode * 53) + ((zzna) obj).zzb.zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:547:0x0d83, code lost:
        if (r9 == r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0d85, code lost:
        r27.putInt(r1, r9, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0d8b, code lost:
        r8 = r0.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0d90, code lost:
        if (r8 >= r0.zzl) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0d92, code lost:
        r0.zzy(r1, r0.zzj[r8], null, r0.zzm, r33);
        r8 = r8 + 1;
        r0 = r32;
        r1 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0da7, code lost:
        if (r10 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0da9, code lost:
        if (r6 != r7) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0dac, code lost:
        defpackage.hfd.q("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0daf, code lost:
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0db0, code lost:
        if (r6 > r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0db2, code lost:
        if (r15 != r10) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0db4, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0db5, code lost:
        defpackage.hfd.q("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0db8, code lost:
        return r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x099c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x09ac A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x05b5 -> B:202:0x05b6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:236:0x0660 -> B:237:0x0661). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:258:0x06b8 -> B:259:0x06ba). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzkt r38) {
        /*
            Method dump skipped, instructions count: 3698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final Object zze() {
        return ((zznd) this.zzg).zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zznd) {
                zznd zzndVar = (zznd) obj;
                zzndVar.zzJ(Integer.MAX_VALUE);
                zzndVar.zza = 0;
                zzndVar.zzH();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int zzu = zzu(i);
                int i2 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j = i2;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case Token.GETPROP /* 33 */:
                            case Token.GETPROPNOWARN /* 34 */:
                            case Token.GETPROP_SUPER /* 35 */:
                            case Token.GETPROPNOWARN_SUPER /* 36 */:
                            case Token.SETPROP /* 37 */:
                            case Token.SETPROP_SUPER /* 38 */:
                            case Token.GETELEM /* 39 */:
                            case Token.GETELEM_SUPER /* 40 */:
                            case Token.SETELEM /* 41 */:
                            case Token.SETELEM_SUPER /* 42 */:
                            case Token.CALL /* 43 */:
                            case Token.NAME /* 44 */:
                            case Token.NUMBER /* 45 */:
                            case Token.STRING /* 46 */:
                            case Token.NULL /* 47 */:
                            case Token.THIS /* 48 */:
                            case Token.FALSE /* 49 */:
                                ((zznk) zzps.zzf(obj, j)).zzb();
                                break;
                            case Token.TRUE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzoc) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                }
                if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            int i2 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i3 = iArr[i];
            long j = i2;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzps.zzo(obj, j, zzps.zza(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i)) {
                        zzps.zzp(obj, j, zzps.zzb(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i)) {
                        zzps.zzm(obj, j, zzps.zzw(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i)) {
                        zzps.zzq(obj, j, zzps.zzc(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i)) {
                        zzps.zzr(obj, j, zzps.zzd(obj2, j));
                        zzH(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Token.GETPROP /* 33 */:
                case Token.GETPROPNOWARN /* 34 */:
                case Token.GETPROP_SUPER /* 35 */:
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                case Token.SETPROP /* 37 */:
                case Token.SETPROP_SUPER /* 38 */:
                case Token.GETELEM /* 39 */:
                case Token.GETELEM_SUPER /* 40 */:
                case Token.SETELEM /* 41 */:
                case Token.SETELEM_SUPER /* 42 */:
                case Token.CALL /* 43 */:
                case Token.NAME /* 44 */:
                case Token.NUMBER /* 45 */:
                case Token.STRING /* 46 */:
                case Token.NULL /* 47 */:
                case Token.THIS /* 48 */:
                case Token.FALSE /* 49 */:
                    zznk zznkVar = (zznk) zzps.zzf(obj, j);
                    zznk zznkVar2 = (zznk) zzps.zzf(obj2, j);
                    int size = zznkVar.size();
                    int size2 = zznkVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zznkVar.zzc()) {
                            zznkVar = zznkVar.zzd(size2 + size);
                        }
                        zznkVar.addAll(zznkVar2);
                    }
                    if (size > 0) {
                        zznkVar2 = zznkVar;
                    }
                    zzps.zzs(obj, j, zznkVar2);
                    break;
                case Token.TRUE /* 50 */:
                    int i4 = zzoy.zza;
                    zzps.zzs(obj, j, zzod.zzb(zzps.zzf(obj, j), zzps.zzf(obj2, j)));
                    break;
                case Token.SHEQ /* 51 */:
                case Token.SHNE /* 52 */:
                case Token.REGEXP /* 53 */:
                case Token.BINDNAME /* 54 */:
                case Token.THROW /* 55 */:
                case Token.RETHROW /* 56 */:
                case Token.IN /* 57 */:
                case Token.INSTANCEOF /* 58 */:
                case Token.LOCAL_LOAD /* 59 */:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case Token.GETVAR /* 60 */:
                    zzF(obj, obj2, i);
                    break;
                case Token.SETVAR /* 61 */:
                case Token.CATCH_SCOPE /* 62 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case Token.ENUM_INIT_VALUES /* 64 */:
                case Token.ENUM_INIT_ARRAY /* 65 */:
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                    if (zzR(obj2, i3, i)) {
                        zzps.zzs(obj, j, zzps.zzf(obj2, j));
                        zzI(obj, i3, i);
                        break;
                    } else {
                        break;
                    }
                case Token.ENUM_ID /* 68 */:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzoy.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzoy.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0853 A[LOOP:3: B:237:0x084f->B:239:0x0853, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0820 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x082d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0172  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzov r19, com.google.android.recaptcha.internal.zzmo r20) {
        /*
            Method dump skipped, instructions count: 2334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzov, com.google.android.recaptcha.internal.zzmo):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzkt zzktVar) {
        zzc(obj, bArr, i, i2, 0, zzktVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0545  */
    @Override // com.google.android.recaptcha.internal.zzow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzj(java.lang.Object r21, com.google.android.recaptcha.internal.zzpy r22) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzol.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzpy):void");
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzk(Object obj, Object obj2) {
        boolean zzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzu = zzu(i);
            long j = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (zzL(obj, obj2, i) && Double.doubleToLongBits(zzps.zza(obj, j)) == Double.doubleToLongBits(zzps.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzL(obj, obj2, i) && Float.floatToIntBits(zzps.zzb(obj, j)) == Float.floatToIntBits(zzps.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzL(obj, obj2, i) && zzps.zzw(obj, j) == zzps.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzL(obj, obj2, i) && zzps.zzc(obj, j) == zzps.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzL(obj, obj2, i) && zzps.zzd(obj, j) == zzps.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzL(obj, obj2, i) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case Token.GETPROP /* 33 */:
                case Token.GETPROPNOWARN /* 34 */:
                case Token.GETPROP_SUPER /* 35 */:
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                case Token.SETPROP /* 37 */:
                case Token.SETPROP_SUPER /* 38 */:
                case Token.GETELEM /* 39 */:
                case Token.GETELEM_SUPER /* 40 */:
                case Token.SETELEM /* 41 */:
                case Token.SETELEM_SUPER /* 42 */:
                case Token.CALL /* 43 */:
                case Token.NAME /* 44 */:
                case Token.NUMBER /* 45 */:
                case Token.STRING /* 46 */:
                case Token.NULL /* 47 */:
                case Token.THIS /* 48 */:
                case Token.FALSE /* 49 */:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case Token.TRUE /* 50 */:
                    zzF = zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j));
                    break;
                case Token.SHEQ /* 51 */:
                case Token.SHNE /* 52 */:
                case Token.REGEXP /* 53 */:
                case Token.BINDNAME /* 54 */:
                case Token.THROW /* 55 */:
                case Token.RETHROW /* 56 */:
                case Token.IN /* 57 */:
                case Token.INSTANCEOF /* 58 */:
                case Token.LOCAL_LOAD /* 59 */:
                case Token.GETVAR /* 60 */:
                case Token.SETVAR /* 61 */:
                case Token.CATCH_SCOPE /* 62 */:
                case Token.ENUM_INIT_KEYS /* 63 */:
                case Token.ENUM_INIT_VALUES /* 64 */:
                case Token.ENUM_INIT_ARRAY /* 65 */:
                case Token.ENUM_INIT_VALUES_IN_ORDER /* 66 */:
                case Token.ENUM_NEXT /* 67 */:
                case Token.ENUM_ID /* 68 */:
                    long zzr = zzr(i) & 1048575;
                    if (zzps.zzc(obj, zzr) == zzps.zzc(obj2, zzr) && zzoy.zzF(zzps.zzf(obj, j), zzps.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzF) {
                return false;
            }
        }
        if (!((zznd) obj).zzc.equals(((zznd) obj2).zzc)) {
            return false;
        }
        if (this.zzh) {
            return ((zzna) obj).zzb.equals(((zzna) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzow
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i6 = iArr[i3];
            int i7 = iArr2[i6];
            int zzu = this.zzu(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i5;
                i2 = i4;
            }
            zzol<T> zzolVar = this;
            Object obj2 = obj;
            if ((268435456 & zzu) != 0 && !zzolVar.zzO(obj2, i6, i, i2, i10)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzoc) zzps.zzf(obj2, zzu & 1048575)).isEmpty()) {
                                zzob zzobVar = (zzob) zzolVar.zzz(i6);
                                throw null;
                            }
                        }
                    } else if (zzolVar.zzR(obj2, i7, i6) && !zzP(obj2, zzu, zzolVar.zzx(i6))) {
                        return false;
                    }
                }
                List list = (List) zzps.zzf(obj2, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzow zzx = zzolVar.zzx(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzx.zzl(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzolVar.zzO(obj2, i6, i, i2, i10) && !zzP(obj2, zzu, zzolVar.zzx(i6))) {
                return false;
            }
            i3++;
            this = zzolVar;
            obj = obj2;
            i5 = i;
            i4 = i2;
        }
        Object obj3 = obj;
        if (this.zzh && !((zzna) obj3).zzb.zzk()) {
            return false;
        }
        return true;
    }
}
