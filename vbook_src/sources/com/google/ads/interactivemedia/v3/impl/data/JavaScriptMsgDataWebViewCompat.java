package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AutoValue_JavaScriptMsgDataWebViewCompat;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class JavaScriptMsgDataWebViewCompat {

    /* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
    /* loaded from: classes.dex */
    public static abstract class Builder {
        public abstract JavaScriptMsgDataWebViewCompat build();

        public abstract Builder setData(String str);

        public abstract Builder setId(String str);

        public abstract Builder setName(String str);

        public abstract Builder setSid(String str);

        public abstract Builder setType(String str);
    }

    public static Builder builder() {
        return new AutoValue_JavaScriptMsgDataWebViewCompat.Builder();
    }

    public abstract String data();

    public abstract String id();

    public abstract String name();

    public abstract String sid();

    public abstract String type();
}
