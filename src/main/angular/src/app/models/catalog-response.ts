export interface Service {
  id: number;
  name: string;
  description: string;
  categories: {
    id: number;
    name: string;
  }[];
}

export interface CatalogResponse {
  error: {
    code: number;
    message?: string;
  };
  content: Service[];
}
