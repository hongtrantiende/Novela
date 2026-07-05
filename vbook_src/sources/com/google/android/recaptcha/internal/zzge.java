package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzge {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzue) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object zza(zzue zzueVar) {
        int zzS = zzueVar.zzS();
        int i = zzS - 1;
        if (zzS != 0) {
            switch (i) {
                case 0:
                    return this.zza.get(Integer.valueOf(zzueVar.zzi()));
                case 1:
                    return Boolean.valueOf(zzueVar.zzQ());
                case 2:
                    byte[] zzl = zzueVar.zzM().zzl();
                    if (zzl.length == 1) {
                        return Byte.valueOf(zzl[0]);
                    }
                    hfd.f(4, 6, null);
                    return null;
                case 3:
                    String zzO = zzueVar.zzO();
                    if (zzO.length() == 1) {
                        return Character.valueOf(zzO.charAt(0));
                    }
                    hfd.f(4, 6, null);
                    return null;
                case 4:
                    int zzj = zzueVar.zzj();
                    if (zzj >= -32768 && zzj <= 32767) {
                        return Short.valueOf((short) zzj);
                    }
                    hfd.f(4, 6, null);
                    return null;
                case 5:
                    return Integer.valueOf(zzueVar.zzk());
                case 6:
                case 8:
                    hfd.f(4, 6, null);
                    return null;
                case 7:
                    return Long.valueOf(zzueVar.zzl());
                case 9:
                    return Float.valueOf(zzueVar.zzg());
                case 10:
                    return Double.valueOf(zzueVar.zzf());
                case 11:
                    return zzueVar.zzP();
                case 12:
                    break;
                default:
                    hfd.f(4, 5, null);
                    break;
            }
            return null;
        }
        throw null;
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i, Object obj) {
        zze(Token.WITHEXPR, obj);
        this.zzb.add(Integer.valueOf((int) Token.WITHEXPR));
    }

    public final void zze(int i, Object obj) {
        this.zza.put(Integer.valueOf(i), obj);
    }

    public final Class[] zzf(List list) {
        List<Object> zzh = zzh(list);
        ArrayList arrayList = new ArrayList(tl1.s(zzh, 10));
        for (Object obj : zzh) {
            arrayList.add(zzgc.zza(obj));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
