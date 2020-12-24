import { ApiError } from './api-error';

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
  error: ApiError;
  content: Service[];
}
