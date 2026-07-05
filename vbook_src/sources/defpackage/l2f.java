package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l2f  reason: default package */
/* loaded from: classes.dex */
public final class l2f implements k6f, qkf, okf {
    public Object a;

    public /* synthetic */ l2f(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.k6f
    public void b(String str, String str2, Bundle bundle) {
        boolean isEmpty = TextUtils.isEmpty(str);
        a6f a6fVar = (a6f) this.a;
        if (isEmpty) {
            lte lteVar = a6fVar.H;
            if (lteVar != null) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.f.f(str2, "AppId not known when logging event");
                return;
            }
            return;
        }
        a6fVar.f().g0(new sid(this, str, str2, bundle, 12, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l2f, java.lang.Object] */
    @Override // defpackage.qkf
    public Iterator c(l97 l97Var, CharSequence charSequence) {
        Matcher matcher = ((z3f) this.a).g0.matcher(charSequence);
        ?? obj = new Object();
        matcher.getClass();
        obj.a = matcher;
        return new ihf(l97Var, charSequence, obj, 0);
    }

    @Override // defpackage.okf
    public Object zza(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((ukf) this.a).a(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
