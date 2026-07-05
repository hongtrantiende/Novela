package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt(boolean z) {
        zzg();
        zzg();
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int zzd;
        int zzA;
        zzpw zzd2 = zzmsVar.zzd();
        int zza = zzmsVar.zza();
        zzmsVar.zzg();
        int zzA2 = zzln.zzA(zza << 3);
        if (zzd2 == zzpw.zzj) {
            byte[] bArr = zznl.zzb;
            if (!(((zzoi) obj) instanceof zzkp)) {
                zzA2 += zzA2;
            } else {
                throw null;
            }
        }
        zzpx zzpxVar = zzpx.INT;
        int i = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                break;
            case 2:
                i = zzln.zzB(((Long) obj).longValue());
                break;
            case 3:
                i = zzln.zzB(((Long) obj).longValue());
                break;
            case 4:
                i = zzln.zzB(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                i = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                break;
            case 7:
                ((Boolean) obj).getClass();
                i = 1;
                break;
            case 8:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                    i = zzA + zzd;
                    break;
                } else {
                    i = zzln.zzz((String) obj);
                    break;
                }
            case 9:
                i = ((zzoi) obj).zzo();
                break;
            case 10:
                if (obj instanceof zzns) {
                    zzd = ((zzns) obj).zza();
                    zzA = zzln.zzA(zzd);
                    i = zzA + zzd;
                    break;
                } else {
                    i = zzln.zzx((zzoi) obj);
                    break;
                }
            case 11:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzln.zzA(zzd);
                }
                i = zzA + zzd;
                break;
            case 12:
                i = zzln.zzA(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof zznf) {
                    i = zzln.zzB(((zznf) obj).zza());
                    break;
                } else {
                    i = zzln.zzB(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).getClass();
                break;
            case 15:
                ((Long) obj).getClass();
                i = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                cy7.e("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return zzA2 + i;
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    private final void zzm(Map.Entry entry) {
        zzoi zzk;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() == zzpx.MESSAGE) {
            Object zze = zze(zzmsVar);
            if (zze == null) {
                this.zza.put(zzmsVar, zzl(value));
                if (z) {
                    this.zzd = true;
                }
            } else if (!z) {
                if (zze instanceof zzon) {
                    zzk = zzmsVar.zzc((zzon) zze, (zzon) value);
                } else {
                    zzk = zzmsVar.zzb(((zzoi) zze).zzae(), (zzoi) value).zzk();
                }
                this.zza.put(zzmsVar, zzk);
            } else {
                throw null;
            }
        } else if (!z) {
            this.zza.put(zzmsVar, zzl(value));
        } else {
            vs.k("Lazy fields must be message-valued");
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        vs.m("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zzo(Map.Entry entry) {
        int i;
        int zzA;
        int zzx;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() == zzpx.MESSAGE) {
            zzmsVar.zzg();
            zzmsVar.zzf();
            if (value instanceof zzns) {
                int zza = ((zzms) entry.getKey()).zza();
                int zzA2 = zzln.zzA(8);
                i = zzA2 + zzA2;
                zzA = zzln.zzA(zza) + zzln.zzA(16);
                int zzA3 = zzln.zzA(24);
                int zza2 = ((zzns) value).zza();
                zzx = eub.z(zza2, zza2, zzA3);
            } else {
                int zza3 = ((zzms) entry.getKey()).zza();
                int zzA4 = zzln.zzA(8);
                i = zzA4 + zzA4;
                zzA = zzln.zzA(zza3) + zzln.zzA(16);
                zzx = zzln.zzx((zzoi) value) + zzln.zzA(24);
            }
            return i + zzA + zzx;
        }
        return zza(zzmsVar, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmt)) {
            return false;
        }
        return this.zza.equals(((zzmt) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        zzpe zzpeVar;
        int zzc = this.zza.zzc();
        int i = 0;
        int i2 = 0;
        while (true) {
            zzpeVar = this.zza;
            if (i >= zzc) {
                break;
            }
            i2 += zzo(zzpeVar.zzg(i));
            i++;
        }
        for (Map.Entry entry : zzpeVar.zzd()) {
            i2 += zzo(entry);
        }
        return i2;
    }

    /* renamed from: zzc */
    public final zzmt clone() {
        zzpe zzpeVar;
        zzmt zzmtVar = new zzmt();
        int zzc = this.zza.zzc();
        int i = 0;
        while (true) {
            zzpeVar = this.zza;
            if (i >= zzc) {
                break;
            }
            Map.Entry zzg = zzpeVar.zzg(i);
            zzmtVar.zzi((zzms) ((zzpa) zzg).zza(), zzg.getValue());
            i++;
        }
        for (Map.Entry entry : zzpeVar.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (!(obj instanceof zzns)) {
            return obj;
        }
        throw null;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.zzd;
        zzpe zzpeVar = this.zza;
        if (z) {
            return new zznq(zzpeVar.entrySet().iterator());
        }
        return zzpeVar.entrySet().iterator();
    }

    public final void zzg() {
        zzpe zzpeVar;
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        int i = 0;
        while (true) {
            zzpeVar = this.zza;
            if (i >= zzc) {
                break;
            }
            Object value = zzpeVar.zzg(i).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
            i++;
        }
        for (Map.Entry entry : zzpeVar.zzd()) {
            Object value2 = entry.getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        zzpe zzpeVar;
        int zzc = zzmtVar.zza.zzc();
        int i = 0;
        while (true) {
            zzpeVar = zzmtVar.zza;
            if (i >= zzc) {
                break;
            }
            zzm(zzpeVar.zzg(i));
            i++;
        }
        for (Map.Entry entry : zzpeVar.zzd()) {
            zzm(entry);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r4 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r4 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(com.google.android.recaptcha.internal.zzms r3, java.lang.Object r4) {
        /*
            r2 = this;
            r3.zzg()
            com.google.android.recaptcha.internal.zzpw r0 = r3.zzd()
            byte[] r1 = com.google.android.recaptcha.internal.zznl.zzb
            r4.getClass()
            com.google.android.recaptcha.internal.zzpw r1 = com.google.android.recaptcha.internal.zzpw.zza
            com.google.android.recaptcha.internal.zzpx r1 = com.google.android.recaptcha.internal.zzpx.INT
            com.google.android.recaptcha.internal.zzpx r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L46;
                case 1: goto L43;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L57
        L1c:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzoi
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L57
            goto L4a
        L25:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zznf
            if (r0 == 0) goto L57
            goto L4a
        L2e:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzle
            if (r0 != 0) goto L4a
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L57
            goto L4a
        L37:
            boolean r0 = r4 instanceof java.lang.String
            goto L48
        L3a:
            boolean r0 = r4 instanceof java.lang.Boolean
            goto L48
        L3d:
            boolean r0 = r4 instanceof java.lang.Double
            goto L48
        L40:
            boolean r0 = r4 instanceof java.lang.Float
            goto L48
        L43:
            boolean r0 = r4 instanceof java.lang.Long
            goto L48
        L46:
            boolean r0 = r4 instanceof java.lang.Integer
        L48:
            if (r0 == 0) goto L57
        L4a:
            boolean r0 = r4 instanceof com.google.android.recaptcha.internal.zzns
            if (r0 == 0) goto L51
            r0 = 1
            r2.zzd = r0
        L51:
            com.google.android.recaptcha.internal.zzpe r2 = r2.zza
            r2.put(r3, r4)
            return
        L57:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r0 = r3.zza()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.google.android.recaptcha.internal.zzpw r3 = r3.zzd()
            com.google.android.recaptcha.internal.zzpx r3 = r3.zza()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzmt.zzi(com.google.android.recaptcha.internal.zzms, java.lang.Object):void");
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int zzc = this.zza.zzc();
        int i = 0;
        while (true) {
            zzpe zzpeVar = this.zza;
            if (i < zzc) {
                if (!zzn(zzpeVar.zzg(i))) {
                    return false;
                }
                i++;
            } else {
                for (Map.Entry entry : zzpeVar.zzd()) {
                    if (!zzn(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private zzmt() {
    }
}
