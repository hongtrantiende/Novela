package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rf  reason: default package */
/* loaded from: classes.dex */
public final class rf {
    public final dq4 a;
    public boolean b;
    public Typeface c;
    public final String d;
    public final File e;

    /* JADX WARN: Type inference failed for: r1v8, types: [dac, java.lang.Object] */
    public rf(String str, byte[] bArr, dq4 dq4Var) {
        yp4[] yp4VarArr = new yp4[0];
        l25 l25Var = new l25(3);
        int i = dq4Var.a;
        if (1 > i || i >= 1001) {
            mv5.a("'wght' value must be in [1, 1000]. Actual: " + i);
        }
        aq4 aq4Var = new aq4(i);
        ArrayList arrayList = l25Var.a;
        arrayList.add(aq4Var);
        arrayList.add(new zp4(nae.e));
        l25Var.f(yp4VarArr);
        new bq4((yp4[]) arrayList.toArray(new yp4[arrayList.size()]));
        str.getClass();
        bArr.getClass();
        dq4Var.getClass();
        dq4Var.getClass();
        this.a = dq4Var;
        this.d = str;
        Context context = twe.e;
        context.getClass();
        e31 e31Var = e31.d;
        String f = p40.o(str).d("MD5").f();
        File file = new File(context.getCacheDir(), "font_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, f);
        if (!file2.exists()) {
            file2.createNewFile();
            lj9 lj9Var = new lj9(new lg8(new FileOutputStream(file2, false), new Object()));
            try {
                lj9Var.write(bArr);
                lj9Var.close();
            } finally {
            }
        }
        this.e = file2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource(path=");
        sb.append(this.d);
        sb.append(", weight=");
        sb.append(this.a);
        sb.append(", style=");
        return s21.q(sb, "Normal", ")");
    }
}
