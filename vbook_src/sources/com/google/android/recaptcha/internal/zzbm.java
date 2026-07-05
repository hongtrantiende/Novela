package com.google.android.recaptcha.internal;

import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (File file : listFiles) {
                    if (r4b.Q(file.getName(), this.zzb, false)) {
                        arrayList.add(file);
                    }
                }
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((File) obj).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) {
        lc1 lc1Var = new lc1('A', 'z');
        ArrayList arrayList = new ArrayList(tl1.s(lc1Var, 10));
        Iterator it = lc1Var.iterator();
        while (true) {
            jc1 jc1Var = (jc1) it;
            boolean z = jc1Var.c;
            if (z) {
                int i = jc1Var.d;
                if (i == jc1Var.b) {
                    if (z) {
                        jc1Var.c = false;
                    } else {
                        xk5.g();
                        return;
                    }
                } else {
                    jc1Var.d = jc1Var.a + i;
                }
                arrayList.add(Character.valueOf((char) i));
            } else {
                List F0 = sl1.F0(arrayList);
                Collections.shuffle(F0);
                String i0 = sl1.i0(((ArrayList) F0).subList(0, 8), "", null, null, null, 62);
                File file = new File(this.zza.getCacheDir(), this.zzb.concat(i0));
                zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
                file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
                return;
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        File file;
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = listFiles[i];
                    if (c16.i(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        if (file == null) {
            return false;
        }
        return true;
    }
}
