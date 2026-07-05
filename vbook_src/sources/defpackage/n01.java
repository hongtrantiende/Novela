package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n01  reason: default package */
/* loaded from: classes.dex */
public final class n01 implements sb4 {
    public final /* synthetic */ int a;
    public final xe8 b;
    public final Object c;

    public /* synthetic */ n01(Object obj, xe8 xe8Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xe8Var;
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [my0, bz0, java.lang.Object] */
    @Override // defpackage.sb4
    public final Object a(n42 n42Var) {
        int i = this.a;
        boolean z = false;
        hg2 hg2Var = hg2.b;
        Object obj = this.c;
        xe8 xe8Var = this.b;
        switch (i) {
            case 0:
                ?? obj2 = new Object();
                obj2.m8write((byte[]) obj);
                return new xta(kxe.e(obj2, xe8Var.f), null, hg2Var);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return new xta(new zta(new mj9(new v01(0, byteBuffer)), xe8Var.f, new w01(byteBuffer)), null, hg2Var);
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = n2d.a;
                boolean z2 = drawable instanceof VectorDrawable;
                if (z2) {
                    Bitmap.Config b = op5.b(xe8Var);
                    cna cnaVar = xe8Var.b;
                    hz9 hz9Var = xe8Var.c;
                    cna cnaVar2 = (cna) fca.k(xe8Var, mp5.b);
                    if (xe8Var.d == z29.b) {
                        z = true;
                    }
                    drawable = new BitmapDrawable(xe8Var.a.getResources(), gue.n(drawable, b, cnaVar, hz9Var, cnaVar2, z));
                }
                return new tn5(aye.d(drawable), z2, hg2Var);
        }
    }
}
